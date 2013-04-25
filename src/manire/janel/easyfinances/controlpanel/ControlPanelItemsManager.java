package manire.janel.easyfinances.controlpanel;

import java.util.ArrayList;

import manire.janel.easyfinances.R;
import manire.janel.easyfinances.category.CategoriesManager;
import manire.janel.easyfinances.category.Category;

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
				this.setControlPanelItemListFields(new ArrayList<ControlPanelItemFields>());
				this.addControlPanelItemFields(new ControlPanelItemFields("Last Movements"));
				this.addControlPanelItemFields(new ControlPanelItemFields("Total Expenses"));
				this.addControlPanelItemFields(new ControlPanelItemFields("Graphs"));
				this.addControlPanelItemFields(new ControlPanelItemFields("Customize"));
				this.addControlPanelItemFields(new ControlPanelItemFields("Settings"));
			}
		//}
		
		/*		END SINGLETON		*/
		
		private ArrayList <ControlPanelItemFields> controlPanelItemListFields;
		
		
		public ControlPanelItemFields getControlPanelItemFields(int position){
			return this.controlPanelItemListFields.get(position);
		}
		
		public void addControlPanelItemFields(ControlPanelItemFields cpi) {
			this.controlPanelItemListFields.add(cpi);
		}
		
		public ArrayList <ControlPanelItemFields> getControlPanelItemListFields() {
			return controlPanelItemListFields;
		}

		public void setControlPanelItemListFields(ArrayList <ControlPanelItemFields> controlPanelItemListFields) {
			this.controlPanelItemListFields = controlPanelItemListFields;
		}
		
		//in case of remove controlPanelItems, we should check if conflicts with elements
}
