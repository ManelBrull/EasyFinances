package manire.janel.easyfinances.utils;

import java.util.ArrayList;

	/**
	 * Class that contains an ArrayList implementing Singleton
	 * @author Manel Brull
	 *
	 */
public class MySingleton {
	/*		Singleton		*/
	
	static private MySingleton mySingleton = null;
	
	static public MySingleton getMySingleton()
	{
		if(mySingleton == null)
			mySingleton = new MySingleton();
		return mySingleton;
	}
	
	@SuppressWarnings("unchecked")
	/**
	 * Basic constructor
	 */
	private MySingleton() {
		this.array = new ArrayList<Object>();
		//this.setControlPanelItemList((ArrayList<ControlPanelItems>) Utils.getObjectFromSharedPreferences("controlPanelItems"));
		//if(this.controlPanelItemsManager == null) {
	}
	
	/*		END SINGLETON		*/
	
	private ArrayList <Object> array;
	
	public Object get(int position){
		return array.get(position);
	}
		
	public void add(Object o){
		this.array.add(o);
	}
	
	public ArrayList <Object> getArray(){
		return this.array;
	}
	
	public void setArray(ArrayList <Object> o){
		this.array = new ArrayList <Object>(o);
	}
 	
}
