package manire.janel.easyfinances.expensescategory;

import java.util.ArrayList;

import manire.janel.easyfinances.R;
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
		//this.setCategoryList((ArrayList<Categories>) Utils.getObjectFromSharedPreferences("categories"));

		//if(this.categoriesManager == null) {
			this.setCategoryList(new ArrayList<Categories>());
			this.addCategory(new Categories(1, "Select Category"));
			this.addCategory(new Categories(1, "Supermarket"));
			this.addCategory(new Categories(1, "Fast-Food Meal"));
			this.addCategory(new Categories(1, "House"));
			this.addCategory(new Categories(1, "Car"));
			this.addCategory(new Categories(1, "Gifts", R.drawable.hardware_computer));
		}
	//}
	
	/*		END SINGLETON		*/
	
	private ArrayList <Categories> categoryList;
	
	
	public Categories getCategory(int position){
		return this.categoryList.get(position);
	}
	
	public void addCategory(Categories cat) {
		this.categoryList.add(cat);
	}
	
	public ArrayList <Categories> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(ArrayList <Categories> categoryList) {
		this.categoryList = categoryList;
	}

}
