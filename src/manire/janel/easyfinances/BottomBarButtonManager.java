package manire.janel.easyfinances;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import manire.janel.easyfinances.elements.ElementManager;
import manire.janel.easyfinances.elements.Expense;
import manire.janel.easyfinances.elements.Income;
import android.app.DatePickerDialog.OnDateSetListener;
import android.os.Bundle;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.actionbarsherlock.app.SherlockFragmentActivity;

public class BottomBarButtonManager  {
	SherlockFragmentActivity activity; //activity in which is shown the bottom button bar
	
	private Button save, clear, date;
	private int year = -1, month = -1, day = -1;
	
	
	static final int DATE_DIALOG_ID = 2608; // Needed for dialog id

	public BottomBarButtonManager(SherlockFragmentActivity act){
		this.activity = act;

		this.save = (Button) act.findViewById(R.id.saveButton);
		this.clear = (Button) act.findViewById(R.id.clearButton);
		this.date = (Button) act.findViewById(R.id.dateButton);

		this.save.setOnClickListener(this.saveListener);
		this.clear.setOnClickListener(this.clearListener);
		this.date.setOnClickListener(this.dateListener);	
	}

	
	private OnClickListener saveListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			//Ocr
			EditText ocr = (EditText) activity.findViewById(R.id.ocrinputfield);
			String ocrS = ocr.getText().toString();
			//Spinner
			Spinner catSelector = (Spinner) activity.findViewById(R.id.spinnercatselect);
			int cat = catSelector.getSelectedItemPosition();			
			//Quantity
			EditText quantity = (EditText) activity.findViewById(R.id.quantityinputfield);
			if (quantity.getText().length() == 0) {
				Toast.makeText(activity.getApplicationContext(), "Empty quantity", Toast.LENGTH_SHORT).show();
			}
			else {
				float q = Float.parseFloat(quantity.getText().toString());
				//Expense / Income
				ToggleButton tb = (ToggleButton) activity.findViewById(R.id.income_expense_button);
				
				String savedDate ="";
				if( year < 0 || month < 0 || day < 0){
					Calendar c = Calendar.getInstance();
					SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
					savedDate = dt.format(c.getTime());
				}
				else {
					String sYear = String.valueOf(year);
					String sMonth = String.valueOf(month);
					String sDay = String.valueOf(day);
					if(month > 0 && month < 10) {
						sMonth = "0" + String.valueOf(month);
					}
					if(day > 0 && day < 10){
						sDay = "0" + String.valueOf(day);
					}
					savedDate = sYear + "-" + sMonth + "-" + sDay;
				}
				if(tb.isChecked()) {
					ElementManager.getElementManager().addElement(
							new Income(ocrS, cat, q, savedDate));
				} else {
					ElementManager.getElementManager().addElement(
							new Expense(ocrS, cat, q, savedDate));
				}
				
				Toast.makeText(activity.getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
				activity.finish();
			}
		}
	};

	private OnClickListener clearListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			
			EditText ocr = (EditText) activity.findViewById(R.id.ocrinputfield);
			ocr.setText(null);
			/* I don�t think we want to clear this
			Spinner catSelector = (Spinner) activity.findViewById(R.id.spinnercatselect);
			catSelector.setSelection(0);
			*/
			EditText quantity = (EditText) activity.findViewById(R.id.quantityinputfield);
			quantity.setText(null);
			
			ToggleButton tb = (ToggleButton) activity.findViewById(R.id.income_expense_button);
			tb.setChecked(false);
		}
	};
	
	/**
	 * The input from the user is received in AddExpenseSimple class
	 */
	private OnClickListener dateListener  = new OnClickListener() {

		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			 FragmentManager fm = activity.getSupportFragmentManager();
		     MyDatePickerDialog myDatePickerDialog = new MyDatePickerDialog(activity);
		     myDatePickerDialog.show(fm, "DatePickerDialog");
		     
		}
		
	};
	public void setYear(int y){
		this.year = y;
	}
	public void setMonth(int m){
		this.month = m;
	}
	public void setDay(int d){
		this.day = d;
	}
}


