package manire.janel.easyfinances;

import manire.janel.easyfinances.category.CategoriesSpinnerAdapter;
import manire.janel.easyfinances.elements.ElementManager;
import manire.janel.easyfinances.elements.Expense;
import manire.janel.easyfinances.elements.Income;
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
			
			//Expense / Income
			ToggleButton tb = (ToggleButton) activity.findViewById(R.id.income_expense_button);
			if(tb.isChecked()) {
				ElementManager.getElementManager().addElement(
						new Income(ocr.getText().toString(),
									catSelector.getFirstVisiblePosition(),
									Float.parseFloat(quantity.getText().toString())));
			} else {
					ElementManager.getElementManager().addElement(
							new Expense(ocr.getText().toString(),
										catSelector.getFirstVisiblePosition(),
										Float.parseFloat(quantity.getText().toString())));
			}
			Toast.makeText(activity.getApplicationContext(), "Saved", Toast.LENGTH_SHORT).show();
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


