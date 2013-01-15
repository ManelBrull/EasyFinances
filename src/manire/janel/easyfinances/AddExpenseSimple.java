package manire.janel.easyfinances;




import manire.janel.easyfinances.category.CategoriesSpinnerAdapter;
import manire.janel.easyfinances.utils.Utils;
import android.os.Bundle;
import android.view.View;
import android.widget.Spinner;

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

 		//Spinner
 		Spinner catSelector = (Spinner) findViewById(R.id.spinnercatselect);
		catSelector.setAdapter(new CategoriesSpinnerAdapter(this.getApplicationContext(), this));

		
		new BottomBarButtonManager(this);
		
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
