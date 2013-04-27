package activity.staples_doug_hwk7;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Handler h = new Handler();
		h.postDelayed(new HomeScreenActivator(), 5000);

	}// end of onCreate

	class HomeScreenActivator implements Runnable {
		public void run() {
			// fire up the MainActivity
			startActivity(new Intent(getApplication(), Splashscreen.class));
			// get rid of the SplashScreen activity
			finish();
		}
	}// end of HomeScreenActivator

}// end of Splash screen
