package manire.janel.easyfinances.expensescategory;

import java.util.ArrayList;

import manire.janel.easyfinances.utils.Utils;

public class CategoriesManager {

	/*		Singleton		*/
	
	static private CategoriesManager categoriesManager = null;
	
	static public CategoriesManager getCategoriesManager()
	{
		if(categoriesManager == null)
			categoriesManager = new CategoriesManager();
		return categoriesManager;
	}
	
	@SuppressWarnings("unchecked")
	private CategoriesManager() {
		this.categoryList = (ArrayList<Categories>) Utils.getObjectFromSharedPreferences("categories");

		if(this.categoriesManager == null) {
			this.categoryList = new ArrayList<Categories>();
		}
	}
	
	/*		END SINGLETON		*/
	
	private ArrayList <Categories> categoryList;
	
}
