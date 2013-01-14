package manire.janel.easyfinances;




import manire.janel.easyfinances.expensescategory.CategoriesSpinnerAdapter;
import manire.janel.easyfinances.utils.Utils;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.ToggleButton;

import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.Menu;
import com.actionbarsherlock.view.MenuItem;

public class AddExpenseSimple extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setTheme(R.style.Theme_Sherlock);
		super.onCreate(savedInstanceState);
		Utils.setContext(this.getApplicationContext());

		setContentView(R.layout.add_expense_simple);
		
		//Ocr
		EditText ocr = (EditText) findViewById(R.id.ocrinputfield);
		
		//Spinner
		Spinner catSelector = (Spinner) findViewById(R.id.spinnercatselect);
		catSelector.setAdapter(new CategoriesSpinnerAdapter(this.getApplicationContext(), this));
		
		//Quantity
		EditText quantity = (EditText) findViewById(R.id.quantityinputfield);
		
		//Income_Expense
		ToggleButton status = (ToggleButton) findViewById(R.id.income_expense_button);
		
		//Bottom bar
		BottomBarButtonManager bbbm = new BottomBarButtonManager(this);
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu){
	    	getSupportMenuInflater().inflate(R.menu.add_expense_simple, menu);
	        return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Menu_settings:
            	//Intent i = new Intent(this, TabsActivity.class);
				//startActivity(i);
                return true; 
            default:
                return true;
        }
    }

	 public void onToggleClicked(View view) {
		 
	 }

}
