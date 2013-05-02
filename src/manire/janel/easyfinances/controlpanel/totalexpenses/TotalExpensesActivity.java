package manire.janel.easyfinances.controlpanel.totalexpenses;

import manire.janel.easyfinances.R;
import manire.janel.easyfinances.R.layout;
import manire.janel.easyfinances.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TotalExpensesActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.total_expenses_activity);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.total_expenses, menu);
		return true;
	}

}
