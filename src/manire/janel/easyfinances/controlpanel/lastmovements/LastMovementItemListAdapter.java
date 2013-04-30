package manire.janel.easyfinances.controlpanel.lastmovements;

import java.util.ArrayList;

import manire.janel.easyfinances.elements.ElementManager;
import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;

public class LastMovementItemListAdapter extends BaseAdapter {

	private Activity activity;
	/**
	 * When we push the item of the ListView, we change de date to OCR
	 * or the OCR to Date.
	 * This is implemented using dateVisibility
	 */
	private ArrayList <Boolean> dateVisibility; 
	
	
	public LastMovementItemListAdapter(Activity act, ArrayList <Boolean> b){
		this.activity = act;
		this.dateVisibility = new ArrayList <Boolean>(b);
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
		LastMovementListItem lmli = new LastMovementListItem(this.activity, position, getDateVisibility(position));
		return lmli;
	}

	public Boolean getDateVisibility(int position){
		return dateVisibility.get(position);
	}
	
	public void changeDateVisibility(int position) {
		
		this.dateVisibility.set(position, !getDateVisibility(position));
	}
	
	public ArrayList <Boolean> getDateVisibility() {
		return dateVisibility;
	}

	public void setDateVisibility(ArrayList <Boolean> dateVisibility) {
		this.dateVisibility = dateVisibility;
	}

}
