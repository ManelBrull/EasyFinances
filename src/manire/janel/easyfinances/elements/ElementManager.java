package manire.janel.easyfinances.elements;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;

public class ElementManager {

	/*	Singleton	*/
	static private ElementManager ElementManager = null;
	
	static public ElementManager getElementManager()
	{
		if(ElementManager == null)
			ElementManager = new ElementManager();
		return ElementManager;
	}
	
	@SuppressWarnings("unchecked")
	private ElementManager() {
		this.elementList = new ArrayList <Element>();
		Calendar c = Calendar.getInstance();
		SimpleDateFormat dt = new SimpleDateFormat("yyyy-MM-dd");
		String savedDate = dt.format(c.getTime());
		addElement(new Expense("Mercadona", 0, 16.25f, savedDate));
		
		c.set(2013, 04, 01);
		savedDate = dt.format(c.getTime());
		addElement(new Expense("Lidl", 0, 22.25f, savedDate));
		
		c.set(2013, 04, 01);
		savedDate = dt.format(c.getTime());
		addElement(new Expense("Cacao-Sampaka", 2, 16.25f, savedDate));
		
		c.set(2013, 02, 21); 
		savedDate = dt.format(c.getTime());
		addElement(new Income("Padres", 3, 50.00f, savedDate));
	}
	
	private ArrayList <Element> elementList;
	
	public Element getElement(int position){
		return this.elementList.get(position);
	}
	
	public void addElement(Element ele) {
		this.elementList.add(ele);
	}
	
	public ArrayList <Element> getElementList() {
		return elementList;
	}

	public void setElementList(ArrayList <Element> ElementList) {
		this.elementList = ElementList;
	}
	
	
	
}
