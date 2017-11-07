package com.example.shuvo.medicare.Reminder;

/**
 * Created by shuvo on 10/12/17.
 */

import com.firebase.client.Firebase;
import com.google.firebase.database.FirebaseDatabase;

public class mediCare extends android.app.Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Firebase.setAndroidContext(this);
        FirebaseDatabase.getInstance().setPersistenceEnabled(true);
       /* if (!FirebaseApp.getApps(this).isEmpty()) {

        }*/
    }
}
