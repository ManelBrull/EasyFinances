/**
 * 
 */
package manire.janel.easyfinances.elements;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.Date;

import manire.janel.easyfinances.category.CategoriesManager;

/**
 * @author Mabrupi
 * Represents an income or expense added by the user
 */
public class Element implements Serializable {


	private static final long serialVersionUID = 1L;
	
	private String ocr;
	private int category; // position number in CategoriesManager
	private float quantity;
	private String date;
	
	
	public Element(String o, int cat, float q, String date) {
		this.setOcr(o);
		this.setCategory(cat);
		this.setQuantity(q); 
		this.setDate(date);
	}
	
	public String toString() {
		String ret = "";
		if(getOcr().length() > 0) {
			ret += this.getOcr() + " ";
		}
		return ret + 
				CategoriesManager.getCategoriesManager().getCategory(this.getCategory()).toString() + 
				 Float.toString(this.getQuantity());
	}

	public String getOcr() {
		return ocr;
	}

	public void setOcr(String ocr) {
		this.ocr = ocr;
	}

	public int getCategory() {
		return category;
	}

	public void setCategory(int category) {
		this.category = category;
	}

	public float getQuantity() {
		return quantity;
	}

	private void setQuantity(float quantity) {
		this.quantity = quantity;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
}
