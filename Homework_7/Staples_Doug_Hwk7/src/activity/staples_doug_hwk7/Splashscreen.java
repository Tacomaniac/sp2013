package activity.staples_doug_hwk7;



import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Splashscreen extends Activity {

	private static final int MANAGE_ASSIGNMENTS_REQUEST_CODE = 1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splashscreen);

		final Button Configure_preferences = (Button) findViewById(R.id.Manage);

		Configure_preferences.setOnClickListener(new Button.OnClickListener() {
			public void onClick(View v) {
				try {
					// fire up the Manage assignments
					startActivityForResult(new Intent(v.getContext(),
							Manageassignments.class),
							MANAGE_ASSIGNMENTS_REQUEST_CODE);
				} catch (Exception e) {
				}
			}
		});
	}// end of onCreate

	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		switch (requestCode) {
		case MANAGE_ASSIGNMENTS_REQUEST_CODE:

			break;

		}
	}

}// End of MainActivity