package manire.janel.easyfinances.controlpanel;

import java.util.ArrayList;

import manire.janel.easyfinances.listitem.BasicListItem;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ControlPanelItemListAdapter extends BaseAdapter {

	private Activity activity;
	/**
	 * Uses ControlPanelItemsManager to load the otions
	 * @param act
	 */
	public ControlPanelItemListAdapter(Activity act){
		this.activity = act;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return ControlPanelItemsManager.getControlPanelItemsManager().getControlPanelItemListFields().size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return ControlPanelItemsManager.getControlPanelItemsManager().getControlPanelItemFields(arg0);
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
				ControlPanelItemsManager.getControlPanelItemsManager().getControlPanelItemFields(position));
		return cpil;
	}

}
