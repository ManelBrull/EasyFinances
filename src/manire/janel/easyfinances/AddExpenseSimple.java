package manire.janel.easyfinances;




import com.actionbarsherlock.app.SherlockActivity;
import com.actionbarsherlock.view.MenuItem;
import com.actionbarsherlock.view.Menu;


import manire.janel.easyfinances.expensescategory.CategoriesSpinnerAdapter;
import manire.janel.easyfinances.utils.Utils;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Spinner;

public class AddExpenseSimple extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		setTheme(R.style.Theme_Sherlock);
		super.onCreate(savedInstanceState);
		Utils.setContext(this.getApplicationContext());

		setContentView(R.layout.add_expense_simple);
		Spinner catSelector = (Spinner) findViewById(R.id.spinnercatselect);
		catSelector.setAdapter(new CategoriesSpinnerAdapter(this.getApplicationContext(), this));
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


}
