package manire.janel.easyfinances;

import manire.janel.easyfinances.expensescategory.CategoriesSpinnerAdapter;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ToggleButton;

import com.actionbarsherlock.app.SherlockActivity;

public class BottomBarButtonManager {
	SherlockActivity activity;
	Button save;
	Button clear;
	Button other;

	public BottomBarButtonManager(SherlockActivity act){
		this.activity = act;

		this.save = (Button) act.findViewById(R.id.saveButton);
		this.clear = (Button) act.findViewById(R.id.clearButton);
		this.other = (Button) act.findViewById(R.id.otherButton);

		this.save.setOnClickListener(this.saveListener);
		this.clear.setOnClickListener(this.clearListener);
		this.other.setOnClickListener(this.otherListener);	
	}

	private OnClickListener saveListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			//Ocr
			EditText ocr = (EditText) activity.findViewById(R.id.ocrinputfield);
			
			//Spinner
			Spinner catSelector = (Spinner) activity.findViewById(R.id.spinnercatselect);
			
			//Quantity
			EditText quantity = (EditText) activity.findViewById(R.id.quantityinputfield);
			
			//Income_Expense
			ToggleButton status = (ToggleButton) activity.findViewById(R.id.income_expense_button);
		}
	};

	private OnClickListener clearListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
	
		}
	};

	private OnClickListener otherListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			activity.finish();
		}
	};
	
}


