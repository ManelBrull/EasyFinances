package manire.janel.easyfinances;


import manire.janel.easyfinances.expensescategory.CategoriesSpinnerAdapter;
import manire.janel.easyfinances.utils.Utils;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.widget.Spinner;

public class AddExpenseSimple extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		
		Utils.setContext(this.getApplicationContext());

		setContentView(R.layout.add_expense_simple);
		Spinner catSelector = (Spinner) findViewById(R.id.spinnercatselect);
		catSelector.setAdapter(new CategoriesSpinnerAdapter(this.getApplicationContext(), this));
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_expense_simple, menu);
		return true;
	}

}
