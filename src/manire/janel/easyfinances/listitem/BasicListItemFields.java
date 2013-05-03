package manire.janel.easyfinances.listitem;
/**
 * Contain the fields of each item of the control panel
 * @author Manel Brull
 *
 */
public class BasicListItemFields {
	private String text;
	private int drawable;
	
	public BasicListItemFields(){
		this.setText("");
		this.setDrawable(-1);
	}
	/**
	 * Constructor only with the text parameter
	 * @param txt String with the text is going to be shown
	 */
	public BasicListItemFields(String txt) {
		this.setText(txt);
		this.setDrawable(-1);
	}
	
	/**
	 * Constructor with the text and the drawable resource
	 * @param txt String with the text is going to be shown
	 * @param drw Resource to be drawn
	 */
	public BasicListItemFields(String txt, int drw) {
		this.setText(txt);
		this.setDrawable(drw);
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

