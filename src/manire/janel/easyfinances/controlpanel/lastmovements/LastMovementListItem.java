package manire.janel.easyfinances.controlpanel.lastmovements;

import manire.janel.easyfinances.R;
import manire.janel.easyfinances.category.CategoriesManager;
import manire.janel.easyfinances.elements.ElementManager;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

public class LastMovementListItem extends LinearLayout {
	
	private TextView date;
	private ImageView image;
	private TextView quantity;
	/**
	 * 
	 * @param cxt
	 * @param position
	 * @param seeDate true -> Date, false -> OCR
	 */
	public LastMovementListItem(Context cxt, int position, Boolean seeDate){
		super(cxt);
		String infService = Context.LAYOUT_INFLATER_SERVICE;
		LayoutInflater li = (LayoutInflater)getContext().getSystemService(infService);
		li.inflate(R.layout.last_movement_item, this, true);
		
		this.date = (TextView) findViewById(R.id.LastMovementItemDate);
		String dateText ="";
		if(seeDate){
			dateText = ElementManager.getElementManager().getElement(position).getDate();
		}
		else {
			dateText = ElementManager.getElementManager().getElement(position).getOcr();
		}
		date.setText(dateText);
		
		this.image = (ImageView) findViewById(R.id.LastMovementItemImage);
		image.setImageResource(
				CategoriesManager.getCategoriesManager().getCategory(
						ElementManager.getElementManager().getElement(position).getCategory()
				).getImg());
				
		this.quantity = (TextView) findViewById(R.id.lastMovementItemQuantity);
		quantity.setText(String.valueOf(
				ElementManager.getElementManager().getElement(position).getQuantity()));
		
	}

}
