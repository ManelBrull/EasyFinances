package manire.janel.easyfinances.listitem;

import manire.janel.easyfinances.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;
/**
 * Class that contains common methods for each item of the List
 * in the Control Panel
 * @author Manel Brull
 *
 */
public class BasicListItem extends LinearLayout {
	
	private Button controlPanelItemButton;
	private BasicListtemFields fields;
	
	/**
	 * Constructor with context and text to display
	 * @param context
	 * @param str
	 */
	public BasicListItem(Context context, String str) {
		super(context);
		this.fields = new BasicListtemFields(str);
		inicializar();
	}
	/**
	 * Constructor with the context, text to display, drawable
	 * @param context
	 * @param str
	 * @param drw 
	 */
	public BasicListItem(Context context, String str, int drw) {
		super(context);
		this.fields = new BasicListtemFields(str, drw);
		inicializar();
	}
	
	/**
	 * Constructor with the context and controlPanelItemFields
	 * @param context
	 * @param ele
	 */
	public BasicListItem(Context context, BasicListtemFields ele){
		super(context);
		this.fields = new BasicListtemFields(ele.getText(), ele.getDrawable());
		inicializar();
	}
	
	
	private void inicializar(){
		String infService = Context.LAYOUT_INFLATER_SERVICE;
		LayoutInflater li = (LayoutInflater)getContext().getSystemService(infService);
		li.inflate(R.layout.control_panel_item, this, true);
		  
		this.setControlPanelItemButton((Button) findViewById(R.id.control_panel_list_button));
		this.getControlPanelItemButton().setText(this.getFields().getText());
	}

	public Button getControlPanelItemButton() {
		return controlPanelItemButton;
	}

	public void setControlPanelItemButton(Button controlPanelItemButton) {
		this.controlPanelItemButton = controlPanelItemButton;
	}
	public BasicListtemFields getFields() {
		return fields;
	}
	public void setFields(BasicListtemFields fields) {
		this.fields = fields;
	}
	
}
