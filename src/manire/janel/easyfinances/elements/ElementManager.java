package manire.janel.easyfinances.elements;

import java.util.ArrayList;

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
		
		addElement(new Expense("Mercadona", 1, 16.25f));
		addElement(new Expense("Lidl", 1, 22.25f));
		addElement(new Expense("Cacao-Sampaka", 3, 16.25f));
		addElement(new Income("Padres", 4, 50.00f));
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
