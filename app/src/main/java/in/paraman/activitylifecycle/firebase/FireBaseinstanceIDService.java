package in.paraman.activitylifecycle.firebase;

import android.util.Log;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.FirebaseInstanceIdService;

public class FireBaseinstanceIDService extends FirebaseInstanceIdService

    {
        private static final String TAG = "MyFirebaseIIDService";
        @Override
        public void onTokenRefresh() {
//Getting registration token
            String refreshedToken = FirebaseInstanceId.getInstance().getToken();
//Displaying token on logcat
            Log.d(TAG, "Refreshed token: " + refreshedToken);
        }
    }

