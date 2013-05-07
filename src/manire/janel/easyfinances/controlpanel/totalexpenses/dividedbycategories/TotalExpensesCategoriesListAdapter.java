package manire.janel.easyfinances.controlpanel.totalexpenses.dividedbycategories;

import manire.janel.easyfinances.category.CategoriesManager;
import manire.janel.easyfinances.listitem.BasicListItem;
import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class TotalExpensesCategoriesListAdapter extends BaseAdapter {

	private Activity activity;
	/**
	 * Uses ControlPanelItemsManager to load the otions
	 * @param act
	 */
	public TotalExpensesCategoriesListAdapter(Activity act){
		this.activity = act;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return CategoriesManager.getCategoriesManager().getCategoryList().size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return CategoriesManager.getCategoriesManager().getCategory(arg0);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		BasicListItem cpil = new BasicListItem(this.activity,
				CategoriesManager.getCategoriesManager().getCategory(position).getNombre());
		return cpil;
	}

}
