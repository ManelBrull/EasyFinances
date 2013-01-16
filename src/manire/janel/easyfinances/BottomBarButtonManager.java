package manire.janel.easyfinances;

import java.text.SimpleDateFormat;
import java.util.Calendar;

import manire.janel.easyfinances.elements.ElementManager;
import manire.janel.easyfinances.elements.Expense;
import manire.janel.easyfinances.elements.Income;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.actionbarsherlock.app.SherlockActivity;

public class BottomBarButtonManager {
	SherlockActivity activity;
	Button save;
	Button clear;
	Button date;

	public BottomBarButtonManager(SherlockActivity act){
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
			float q = Float.parseFloat(quantity.getText().toString());
			//Expense / Income
			ToggleButton tb = (ToggleButton) activity.findViewById(R.id.income_expense_button);
			//Date
			Calendar c = Calendar.getInstance();
	        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd");
	        String formattedDate = df.format(c.getTime());
			
			
			if(tb.isChecked()) {
				ElementManager.getElementManager().addElement(
						new Income(ocrS, cat, q));
			} else {
				ElementManager.getElementManager().addElement(
						new Expense(ocrS, cat, q));
			}
			
			Toast.makeText(activity.getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
		}
	};

	private OnClickListener clearListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			
			EditText ocr = (EditText) activity.findViewById(R.id.ocrinputfield);
			ocr.setText(null);
			
			Spinner catSelector = (Spinner) activity.findViewById(R.id.spinnercatselect);
			catSelector.setSelection(0);
			
			EditText quantity = (EditText) activity.findViewById(R.id.quantityinputfield);
			quantity.setText(null);
			
			ToggleButton tb = (ToggleButton) activity.findViewById(R.id.income_expense_button);
			tb.setChecked(false);
		}
	};

	private OnClickListener dateListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			Intent i = new Intent(activity, DatePickerActivity.class);
			activity.startActivity(i);
		}
	};
	
}


