package manire.janel.easyfinances.controlpanel;

import java.util.ArrayList;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

public class ControlPanelItemListAdapter extends BaseAdapter {

	private Activity activity;
	private ArrayList <String> controlPanelItems;
	
	public ControlPanelItemListAdapter(Activity act, ArrayList <String> ControlPanelItems){
		this.activity = act;
		this.controlPanelItems = new ArrayList <String>(ControlPanelItems);
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return controlPanelItems.size();
	}

	@Override
	public Object getItem(int arg0) {
		// TODO Auto-generated method stub
		return this.controlPanelItems.get(arg0);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		ControlPanelItem cpil = new ControlPanelItem(this.activity,
							this.controlPanelItems.get(position));
		return cpil;
	}

}
