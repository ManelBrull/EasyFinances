package manire.janel.easyfinances.controlpanel.lastmovements;

import manire.janel.easyfinances.elements.ElementManager;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

public class LastMovementItemListAdapter extends BaseAdapter {

	private Activity activity;
	
	public LastMovementItemListAdapter(Activity act){
		this.activity = act;
	}
	
	@Override
	public int getCount() {
		// TODO Auto-generated method stub
		return ElementManager.getElementManager().getElementList().size();
	}

	@Override
	public Object getItem(int position) {
		// TODO Auto-generated method stub
		return ElementManager.getElementManager().getElement(position);
	}

	@Override
	public long getItemId(int position) {
		// TODO Auto-generated method stub
		return position;
	}

	@Override
	public View getView(int position, View convertView, ViewGroup parent) {
		// TODO Auto-generated method stub
		LastMovementListItem lmli = new LastMovementListItem(this.activity, position);
		return lmli;
	}

}
