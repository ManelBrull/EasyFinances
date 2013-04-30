package manire.janel.easyfinances.controlpanel.lastmovements;

import java.util.ArrayList;

import manire.janel.easyfinances.R;
import manire.janel.easyfinances.elements.ElementManager;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;
import android.widget.TextView;

public class LastMovementsActivity extends Activity {

	private ListView list;
	private LastMovementItemListAdapter adapter;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.last_movements_activity);
		list = (ListView) findViewById(R.id.lastMovementsActivityList);
		
		/**
		 * We have to initialitze ArryList <Boolean> for the visibility of the date
		 * It has the same size as the number of total elements.
		 * All of them are true initially
		 * Remember:
		 * 		true -> Date
		 * 		false -> OCR
		 * I accept suggestions of how to improve this part of my android activity
		 */
		ArrayList <Boolean> dateVisibility = new ArrayList <Boolean>();
		int size = ElementManager.getElementManager().getElementList().size();
		for(int i = 0; i < size; i++){
			dateVisibility.add(true);
		}
		/**
		 * Finished. I have to think in a better way to do this.
		 */
		
		adapter = new LastMovementItemListAdapter(this, dateVisibility);
		list.setAdapter(adapter);
		list.setOnItemClickListener(new OnItemClickListener(){

			@Override
			public void onItemClick(AdapterView<?> parent, View view, int position,
					long id) {
				// TODO Auto-generated method stub
				adapter.changeDateVisibility(position);
				adapter.notifyDataSetChanged();
				//TextView date = (TextView) view.findViewById(R.id.LastMovementItemDate);
				//date.setText(ElementManager.getElementManager().getElement(position).getOcr());
			}
			
		});
		
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.last_movements, menu);
		return true;
	}

}
