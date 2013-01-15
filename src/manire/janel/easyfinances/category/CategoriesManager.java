package manire.janel.easyfinances.category;

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
			this.setCategoryList(new ArrayList<Category>());
			this.addCategory(new Category(1, "Uncategorized"));
			this.addCategory(new Category(2, "Supermarket"));
			this.addCategory(new Category(3, "Fast-Food Meal"));
			this.addCategory(new Category(4, "House"));
			this.addCategory(new Category(5, "Car"));
			this.addCategory(new Category(6, "Gifts", R.drawable.hardware_computer));
		}
	//}
	
	/*		END SINGLETON		*/
	
	private ArrayList <Category> categoryList;
	
	
	public Category getCategory(int position){
		return this.categoryList.get(position);
	}
	
	public void addCategory(Category cat) {
		this.categoryList.add(cat);
	}
	
	public ArrayList <Category> getCategoryList() {
		return categoryList;
	}

	public void setCategoryList(ArrayList <Category> categoryList) {
		this.categoryList = categoryList;
	}
	
	//in case of remove categories, we should check if conflicts with elements
}
