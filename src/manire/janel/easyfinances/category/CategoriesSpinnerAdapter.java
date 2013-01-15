package manire.janel.easyfinances.category;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.SpinnerAdapter;

public class CategoriesSpinnerAdapter extends BaseAdapter implements SpinnerAdapter {

	private Activity activity;
	
	public CategoriesSpinnerAdapter(Context cxt, Activity act) {
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
		return CategoriesManager.getCategoriesManager().getCategoryList().get(arg0);
	}

	@Override
	public long getItemId(int arg0) {
		// TODO Auto-generated method stub
		return arg0;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		return CategoriesManager.getCategoriesManager().getCategory(position).getSpinnerView(activity);
	}
	
	@Override
	public View getDropDownView(int position, View convertView, ViewGroup parent) {
		return CategoriesManager.getCategoriesManager().getCategory(position).getSpinnerView(activity);
	};

}
