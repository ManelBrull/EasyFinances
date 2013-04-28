package manire.janel.easyfinances.controlpanel.lastmovements;

import manire.janel.easyfinances.R;
import manire.janel.easyfinances.elements.ElementManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LastMovementListItem extends LinearLayout {
	
	private TextView date;
	
	public LastMovementListItem(Context cxt, int position){
		super(cxt);
		String infService = Context.LAYOUT_INFLATER_SERVICE;
		LayoutInflater li = (LayoutInflater)getContext().getSystemService(infService);
		li.inflate(R.layout.last_movement_item, this, true);
		this.date = (TextView) findViewById(R.id.LastMovementItemDate);
		String dateText = ElementManager.getElementManager().getElement(position).getDate();
		date.setText(dateText);
	}

}
