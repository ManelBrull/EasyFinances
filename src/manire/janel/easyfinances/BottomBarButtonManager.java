package manire.janel.easyfinances;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

import com.actionbarsherlock.app.SherlockActivity;

public class BottomBarButtonManager {
	SherlockActivity activity;
	Button save;
	Button clear;
	Button other;

	public BottomBarButtonManager(SherlockActivity act){
		this.activity = act;

		this.save = (Button) act.findViewById(R.id.saveButton);
		this.clear = (Button) act.findViewById(R.id.clearButton);
		this.other = (Button) act.findViewById(R.id.otherButton);

		this.save.setOnClickListener(this.saveListener);
		this.clear.setOnClickListener(this.clearListener);
		this.other.setOnClickListener(this.otherListener);	
	}

	private OnClickListener saveListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
		}
	};

	private OnClickListener clearListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
	
		}
	};

	private OnClickListener otherListener = new OnClickListener() {
		@Override
		public void onClick(View v) {
			activity.finish();
		}
	};
	
}


