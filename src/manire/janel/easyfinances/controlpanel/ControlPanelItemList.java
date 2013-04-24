package manire.janel.easyfinances.controlpanel;

import manire.janel.easyfinances.R;
import android.content.Context;
import android.view.LayoutInflater;
import android.widget.Button;
import android.widget.LinearLayout;

public class ControlPanelItemList extends LinearLayout {
	
	private Button control_panel_list_button;
	private String text;
	
	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}

	public ControlPanelItemList(Context context, String str) {
		super(context);
		this.setText(str);
		inicializar();
	}
	private void inicializar(){
		String infService = Context.LAYOUT_INFLATER_SERVICE;
		LayoutInflater li = (LayoutInflater)getContext().getSystemService(infService);
		li.inflate(R.layout.control_panel_item_list, this, true);
		  
		this.control_panel_list_button = (Button) findViewById(R.id.control_panel_list_button);
		this.control_panel_list_button.setText(getText());
	}
}
