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
		/*
		Date dt = new Date(2013, 04, 28);
		Date dt = new Date
		SimpleDateFormat dts = new SimpleDateFormat("yyyy-MM-dd");
		String savedDate = dts.format(dt);
		addElement(new Expense("Mercadona", 1, 16.25f, savedDate));
		dt = new Date(2013, 04, 27);
		savedDate = dts.format(dt);
		addElement(new Expense("Lidl", 1, 22.25f, savedDate));
		dt = new Date(2013, 04, 26);
		savedDate = dts.format(dt);
		addElement(new Expense("Cacao-Sampaka", 3, 16.25f, savedDate));
		dt = new Date(2013,04, 25);
		savedDate = dts.format(dt);
		addElement(new Income("Padres", 4, 50.00f, savedDate));
		*/
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
