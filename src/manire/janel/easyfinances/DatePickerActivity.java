package manire.janel.easyfinances;

import android.os.Bundle;
import android.view.WindowManager;
import android.widget.DatePicker;

import com.actionbarsherlock.app.SherlockActivity;

public class DatePickerActivity extends SherlockActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.date_picker);
		
		DatePicker dp = (DatePicker) findViewById(R.id.datepicker);
	}
	
	
}
