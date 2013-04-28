package manire.janel.easyfinances.controlpanel.lastmovements;

import manire.janel.easyfinances.R;
import manire.janel.easyfinances.R.layout;
import manire.janel.easyfinances.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.widget.ListView;

public class LastMovementsActivity extends Activity {

	private ListView list;
	private LastMovementItemListAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.last_movements_activity);
		list = (ListView) findViewById(R.id.lastMovementsActivityList);
		
		adapter = new LastMovementItemListAdapter(this);
		list.setAdapter(adapter);
		
		
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.last_movements, menu);
		return true;
	}

}
