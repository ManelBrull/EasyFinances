package manire.janel.easyfinances;

import java.util.Calendar;

import android.app.DatePickerDialog;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.Dialog;
import android.os.Bundle;

import com.actionbarsherlock.app.SherlockDialogFragment;
import com.actionbarsherlock.app.SherlockFragmentActivity;

public class MyDatePickerDialog extends SherlockDialogFragment {
	private SherlockFragmentActivity mFragment;
	
	public MyDatePickerDialog(SherlockFragmentActivity activity) {
		mFragment = (SherlockFragmentActivity) activity;
	}
	
	public Dialog onCreateDialog(Bundle savedInstanceState){
		final Calendar c = Calendar.getInstance();
		int year = c.get(Calendar.YEAR);
	    int month = c.get(Calendar.MONTH);
	    int day = c.get(Calendar.DAY_OF_MONTH);
		return new DatePickerDialog(getActivity(),
				(OnDateSetListener) mFragment, year, month, day);
	}


}
