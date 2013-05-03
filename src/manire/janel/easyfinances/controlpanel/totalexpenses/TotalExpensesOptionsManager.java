package manire.janel.easyfinances.controlpanel.totalexpenses;

import java.util.ArrayList;

import manire.janel.easyfinances.R;
import manire.janel.easyfinances.category.CategoriesManager;
import manire.janel.easyfinances.category.Category;
import manire.janel.easyfinances.listitem.BasicListItemFields;

public class TotalExpensesOptionsManager {
		/*		Singleton		*/
		
		static private TotalExpensesOptionsManager totalExpensesOptionsManager = null;
		
		static public TotalExpensesOptionsManager getTotalExpensesOptionsManager()
		{
			if(totalExpensesOptionsManager == null)
				totalExpensesOptionsManager = new TotalExpensesOptionsManager();
			return totalExpensesOptionsManager;
		}
		
		@SuppressWarnings("unchecked")
		private TotalExpensesOptionsManager() {
			//this.setTotalExpensesOptionList((ArrayList<TotalExpensesOptions>) Utils.getObjectFromSharedPreferences("totalExpensesOptions"));
			//if(this.totalExpensesOptionsManager == null) {
				this.setTotalExpensesOptionListFields(new ArrayList<BasicListItemFields>());
				this.addTotalExpensesOptionFields(new BasicListItemFields("Total"));
				this.addTotalExpensesOptionFields(new BasicListItemFields("Divided By Categories"));
				this.addTotalExpensesOptionFields(new BasicListItemFields("Today"));
				this.addTotalExpensesOptionFields(new BasicListItemFields("Weekly"));
				this.addTotalExpensesOptionFields(new BasicListItemFields("Monthly"));
			}
		//}
		
		/*		END SINGLETON		*/
		
		private ArrayList <BasicListItemFields> totalExpensesOptionListFields;
		
		
		public BasicListItemFields getTotalExpensesOptionFields(int position){
			return this.totalExpensesOptionListFields.get(position);
		}
		
		public void addTotalExpensesOptionFields(BasicListItemFields cpi) {
			this.totalExpensesOptionListFields.add(cpi);
		}
		
		public ArrayList <BasicListItemFields> getTotalExpensesOptionListFields() {
			return totalExpensesOptionListFields;
		}

		public void setTotalExpensesOptionListFields(ArrayList <BasicListItemFields> totalExpensesOptionListFields) {
			this.totalExpensesOptionListFields = totalExpensesOptionListFields;
		}
		
		//in case of remove totalExpensesOptions, we should check if conflicts with elements
}
