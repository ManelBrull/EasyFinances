package manire.janel.easyfinances.controlpanel.totalexpenses.dividedbycategories;

import manire.janel.easyfinances.R;
import manire.janel.easyfinances.category.CategoriesManager;
import manire.janel.easyfinances.controlpanel.ControlPanelActivity;
import manire.janel.easyfinances.elements.ElementManager;
import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.Toast;

public class TotalExpensesCategoriesActivity extends Activity {

	private TotalExpensesCategoriesListAdapter adapter;
	private ListView list;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_total_expenses_categories);
		
		list = (ListView) findViewById(R.id.totalExpensesCategoriesList);
		adapter = new TotalExpensesCategoriesListAdapter(this);
		list.setAdapter(adapter);
		adapter.notifyDataSetChanged();
	}
	
	public void controlPanelButtonHandler(View v) {
		//get the row the clicked button is in
		LinearLayout vwParentRow = (LinearLayout)v.getParent();

		Button btnChild = (Button)vwParentRow.getChildAt(0);
		String buttonClicked = btnChild.getText().toString();
		for(int j = 0; j < CategoriesManager.getCategoriesManager().getCategoryList().size(); j++){
			if(buttonClicked == CategoriesManager.getCategoriesManager().getCategory(j).getNombre()){
				if (ElementManager.getElementManager().getElementList().size() == 0){
					Toast.makeText(getApplicationContext(), "Total " + 
						CategoriesManager.getCategoriesManager().getCategory(j).getNombre() +" = 0", 
							Toast.LENGTH_SHORT).show();
				}
				else {
					double total = 0.00f;
					for(int i = 0; i < ElementManager.getElementManager().getElementList().size(); i++){
						if(ElementManager.getElementManager().getElement(i).getCategory() == j)
							total += ElementManager.getElementManager().getElement(i).getQuantity();
					}
					Toast.makeText(getApplicationContext(), "Total "+ 
							CategoriesManager.getCategoriesManager().getCategory(j).getNombre() + 
								"= " + String.valueOf(total), Toast.LENGTH_SHORT).show();
				}
			}
		}
		vwParentRow.refreshDrawableState();
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.total_expenses_categories, menu);
		return true;
	}

}
