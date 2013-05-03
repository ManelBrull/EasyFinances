package manire.janel.easyfinances.controlpanel.totalexpenses;

import manire.janel.easyfinances.R;
import manire.janel.easyfinances.R.layout;
import manire.janel.easyfinances.R.menu;
import manire.janel.easyfinances.controlpanel.ControlPanelItemListAdapter;
import manire.janel.easyfinances.controlpanel.lastmovements.LastMovementsActivity;
import manire.janel.easyfinances.elements.ElementManager;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class TotalExpensesActivity extends Activity {

	private TotalExpensesOptionsListAdapter adapter;
	private ListView list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.total_expenses_layout);
		list = (ListView) findViewById(R.id.total_expenses_options);
		
		adapter = new TotalExpensesOptionsListAdapter(this);
		list.setAdapter(adapter);
		adapter.notifyDataSetChanged();
	}

	public void controlPanelButtonHandler(View v) {
	    //get the row the clicked button is in
		LinearLayout vwParentRow = (LinearLayout)v.getParent();
	 	
	    Button btnChild = (Button)vwParentRow.getChildAt(0);
	    String buttonClicked = btnChild.getText().toString();
	    
	    String show = "0";
	    
//	    if(buttonClicked == "Last Movements"){
	    	// do stuff
	    
	  /*  if(buttonClicked == this.totalExpenses){
	    	// do stuff
	    	show = "2";
	    }
	    if(buttonClicked == this.graphs){
	    	// do stuff
	    	show = "3";
	    }
	    if(buttonClicked == this.customize){
	    	// do stuff
	    	show = "4";
	    }
	    if(buttonClicked == this.settings){
	    	// do stuff
	    	show = "5";
	    }
	    */
	    Toast.makeText(getApplicationContext(), show, Toast.LENGTH_LONG).show();
		vwParentRow.refreshDrawableState();
	    
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.total_expenses, menu);
		return true;
	}

}
