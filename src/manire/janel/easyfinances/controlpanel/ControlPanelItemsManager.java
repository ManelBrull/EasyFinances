package manire.janel.easyfinances.controlpanel;

import java.util.ArrayList;

import manire.janel.easyfinances.R;
import manire.janel.easyfinances.category.CategoriesManager;
import manire.janel.easyfinances.category.Category;
import manire.janel.easyfinances.listitem.BasicListItemFields;

public class ControlPanelItemsManager {
		/*		Singleton		*/
		
		static private ControlPanelItemsManager controlPanelItemsManager = null;
		
		static public ControlPanelItemsManager getControlPanelItemsManager()
		{
			if(controlPanelItemsManager == null)
				controlPanelItemsManager = new ControlPanelItemsManager();
			return controlPanelItemsManager;
		}
		
		@SuppressWarnings("unchecked")
		private ControlPanelItemsManager() {
			//this.setControlPanelItemList((ArrayList<ControlPanelItems>) Utils.getObjectFromSharedPreferences("controlPanelItems"));
			//if(this.controlPanelItemsManager == null) {
				this.setControlPanelItemListFields(new ArrayList<BasicListItemFields>());
				this.addControlPanelItemFields(new BasicListItemFields("Last Movements"));
				this.addControlPanelItemFields(new BasicListItemFields("Total Expenses"));
				this.addControlPanelItemFields(new BasicListItemFields("Graphs"));
				this.addControlPanelItemFields(new BasicListItemFields("Customize"));
				this.addControlPanelItemFields(new BasicListItemFields("Settings"));
			}
		//}
		
		/*		END SINGLETON		*/
		
		private ArrayList <BasicListItemFields> controlPanelItemListFields;
		
		
		public BasicListItemFields getControlPanelItemFields(int position){
			return this.controlPanelItemListFields.get(position);
		}
		
		public void addControlPanelItemFields(BasicListItemFields cpi) {
			this.controlPanelItemListFields.add(cpi);
		}
		
		public ArrayList <BasicListItemFields> getControlPanelItemListFields() {
			return controlPanelItemListFields;
		}

		public void setControlPanelItemListFields(ArrayList <BasicListItemFields> controlPanelItemListFields) {
			this.controlPanelItemListFields = controlPanelItemListFields;
		}
		
		//in case of remove controlPanelItems, we should check if conflicts with elements
}
