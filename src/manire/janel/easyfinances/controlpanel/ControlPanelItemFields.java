package manire.janel.easyfinances.controlpanel;
/**
 * Contain the fields of each item of the control panel
 * @author Manel Brull
 *
 */
public class ControlPanelItemFields {
	private String text;
	private int drawable;
	
	public ControlPanelItemFields(){
		setText("");
		setDrawable(-1);
	}
	/**
	 * Constructor only with the text parameter
	 * @param txt String with the text is going to be shown
	 */
	public ControlPanelItemFields(String txt) {
		setText(txt);
		setDrawable(-1);
	}
	
	/**
	 * Constructor with the text and the drawable resource
	 * @param txt String with the text is going to be shown
	 * @param drw Resource to be drawn
	 */
	public ControlPanelItemFields(String txt, int drw) {
		setText(txt);
		setDrawable(drw);
	}
	
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public int getDrawable() {
		return drawable;
	}
	public void setDrawable(int drawable) {
		this.drawable = drawable;
	}

}

