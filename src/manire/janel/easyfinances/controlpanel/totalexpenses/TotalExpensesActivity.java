package manire.janel.easyfinances.controlpanel.totalexpenses;

import java.text.SimpleDateFormat;
import java.util.Calendar;

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

		if(buttonClicked == "Total"){
			if (ElementManager.getElementManager().getElementList().size() == 0){
				Toast.makeText(getApplicationContext(), "Total = 0", Toast.LENGTH_SHORT).show();
			}
			else {
				double total = 0.00f;
				for(int i = 0; i < ElementManager.getElementManager().getElementList().size(); i++){
					total += ElementManager.getElementManager().getElement(i).getQuantity();
				}
				Toast.makeText(getApplicationContext(), "Total = " + String.valueOf(total), Toast.LENGTH_SHORT).show();
			}
		}

		if(buttonClicked == "Divided By Categories"){

		}
		if(buttonClicked == "Today"){
			if (ElementManager.getElementManager().getElementList().size() == 0){
				Toast.makeText(getApplicationContext(), "Total = 0", Toast.LENGTH_SHORT).show();
			}
			else {
				double today = 0.00f;
				Calendar c = Calendar.getInstance();
				SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
				String savedDate = dt.format(c.getTime());
				
				for(int i = 0; i < ElementManager.getElementManager().getElementList().size(); i++){
					if(ElementManager.getElementManager().getElement(i).getDate().equals(savedDate)){
						today += ElementManager.getElementManager().getElement(i).getQuantity();
					}
				}
				Toast.makeText(getApplicationContext(), "Today = " + String.valueOf(today), Toast.LENGTH_SHORT).show();
			}
		}
		if(buttonClicked == "Weekly"){

		}
		if(buttonClicked == "Monthly"){

		}
		vwParentRow.refreshDrawableState();
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.total_expenses, menu);
		return true;
	}

}
