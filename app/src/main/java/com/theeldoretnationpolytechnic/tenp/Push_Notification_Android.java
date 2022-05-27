package com.theeldoretnationpolytechnic.tenp;
import android.util.Log;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;
import static android.content.ContentValues.TAG;
public class Push_Notification_Android extends FirebaseMessagingService {
    public Push_Notification_Android() {
    }
    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d(TAG, "From: " + remoteMessage.getFrom());
        Log.d(TAG, "Message data payload: " + remoteMessage.getData());
    }
    @Override
    public void onNewToken(String s) {
        super.onNewToken(s);
    }
}