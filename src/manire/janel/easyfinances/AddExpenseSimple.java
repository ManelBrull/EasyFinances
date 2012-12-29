package manire.janel.easyfinances;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class AddExpenseSimple extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.add_expense_simple);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.add_expense_simple, menu);
		return true;
	}

}
