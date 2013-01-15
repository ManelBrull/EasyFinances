/**
 * 
 */
package manire.janel.easyfinances.elements;

import java.io.Serializable;

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
	
	public Element(String o, int cat, float q) {
		this.setOcr(o);
		this.setCategory(cat);
		this.setQuantity(q); 
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

	private float getQuantity() {
		return quantity;
	}

	private void setQuantity(float quantity) {
		this.quantity = quantity;
	}
	
	
	
}
