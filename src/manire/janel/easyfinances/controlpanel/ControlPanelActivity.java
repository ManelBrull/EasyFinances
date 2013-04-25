package manire.janel.easyfinances.controlpanel;

import java.util.ArrayList;

import manire.janel.easyfinances.R;
import manire.janel.easyfinances.R.layout;
import manire.janel.easyfinances.R.menu;
import manire.janel.easyfinances.controlpanel.lastmovements.LastMovementsActivity;
import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

public class ControlPanelActivity extends Activity {

	private ControlPanelItemListAdapter adapter;
	private ListView list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.control_panel_layout);
		list = (ListView) findViewById(R.id.control_panel_list);
		
		adapter = new ControlPanelItemListAdapter(this);
		list.setAdapter(adapter);
		adapter.notifyDataSetChanged();
	}
	
	/**
	 * Handler for each button of the control panel
	 * @param v View
	 */
	public void controlPanelButtonHandler(View v) {
	    //get the row the clicked button is in
		LinearLayout vwParentRow = (LinearLayout)v.getParent();
	 		
	    Button btnChild = (Button)vwParentRow.getChildAt(0);
	    String buttonClicked = btnChild.getText().toString();
	    
	    String show = "0";
	    
	    if(buttonClicked == "Last Movements"){
	    	// do stuff
	    	Intent i = new Intent(this, LastMovementsActivity.class);
	    	startActivity(i);
	    }
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
		getMenuInflater().inflate(R.menu.control_panel, menu);
		return true;
	}

}
