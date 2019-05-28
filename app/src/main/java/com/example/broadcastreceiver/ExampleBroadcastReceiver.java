package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.net.ConnectivityManager;
import android.widget.Toast;

public class ExampleBroadcastReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {
    if (Intent.ACTION_BOOT_COMPLETED.equals(intent.getAction())) {
        Toast.makeText(context, "Boot Completed", Toast.LENGTH_LONG).show();
    }

    if(ConnectivityManager.CONNECTIVITY_ACTION.equals(intent.getAction())){
        Toast.makeText(context, "Connectivity Changed", Toast.LENGTH_LONG).show();
    }
    }
}
