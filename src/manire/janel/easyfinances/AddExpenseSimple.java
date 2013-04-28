package manire.janel.easyfinances;

import manire.janel.easyfinances.category.CategoriesSpinnerAdapter;
import manire.janel.easyfinances.controlpanel.ControlPanelActivity;
import manire.janel.easyfinances.utils.Utils;
import android.app.DatePickerDialog.OnDateSetListener;
import android.content.Intent;
import android.os.Bundle;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import com.actionbarsherlock.app.SherlockFragmentActivity;
import com.actionbarsherlock.view.MenuItem;

public class AddExpenseSimple extends SherlockFragmentActivity implements OnDateSetListener  {

	BottomBarButtonManager bottomBarButtonManager;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setTheme(R.style.Theme_Sherlock);
		super.onCreate(savedInstanceState);
		Utils.setContext(this.getApplicationContext());
		setContentView(R.layout.add_expense_simple);
		
		//focus on quantity field is wanted
		EditText quantity = (EditText) findViewById(R.id.quantityinputfield);
		quantity.requestFocus();
		
		
 		//Spinner
 		Spinner catSelector = (Spinner) findViewById(R.id.spinnercatselect);
		catSelector.setAdapter(new CategoriesSpinnerAdapter(this.getApplicationContext(), this));

		this.bottomBarButtonManager = new BottomBarButtonManager(this);		
	}

	@Override
	public boolean onCreateOptionsMenu(com.actionbarsherlock.view.Menu menu){
			getSupportMenuInflater().inflate(R.menu.add_expense_simple, menu);
	        return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.Menu_settings:
            	Intent i = new Intent(this, ControlPanelActivity.class);
				startActivity(i);
                return true; 
            default:
                return true;
        }
    }

	@Override
	public void onDateSet(DatePicker view, int year, int monthOfYear,
			int dayOfMonth) {
		// TODO Auto-generated method stub
		this.bottomBarButtonManager.setDay(dayOfMonth);
		this.bottomBarButtonManager.setMonth(monthOfYear+1);
		this.bottomBarButtonManager.setYear(year);
	}
}
