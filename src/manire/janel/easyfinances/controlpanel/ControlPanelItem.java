package manire.janel.easyfinances.controlpanel;

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
public class ControlPanelItem extends LinearLayout {
	
	private Button controlPanelItemButton;
	private ControlPanelItemFields fields;
	
	/**
	 * Constructor with context and text to display
	 * @param context
	 * @param str
	 */
	public ControlPanelItem(Context context, String str) {
		super(context);
		this.fields = new ControlPanelItemFields(str);
		inicializar();
	}
	/**
	 * Constructor with the context, text to display, drawable
	 * @param context
	 * @param str
	 * @param drw 
	 */
	public ControlPanelItem(Context context, String str, int drw) {
		super(context);
		this.fields = new ControlPanelItemFields(str, drw);
		inicializar();
	}
	
	/**
	 * Constructor with the context and controlPanelItemFields
	 * @param context
	 * @param ele
	 */
	public ControlPanelItem(Context context, ControlPanelItemFields ele){
		super(context);
		this.fields = new ControlPanelItemFields(ele.getText(), ele.getDrawable());
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
	public ControlPanelItemFields getFields() {
		return fields;
	}
	public void setFields(ControlPanelItemFields fields) {
		this.fields = fields;
	}
	
}
