package com.example.broadcastreceiver;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
//    private ExampleBroadcastReceiver exampleBroadcastReceiver = new ExampleBroadcastReceiver();
    private OrderedReceiver1 orderedReceiver1 = new OrderedReceiver1();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        IntentFilter intentFilter = new IntentFilter("com.example.EXAMPLE_ACTION");
        intentFilter.setPriority(1);
        registerReceiver(orderedReceiver1, intentFilter);

//        IntentFilter filter = new IntentFilter("com.example.EXAMPLE_ACTION");
//        registerReceiver(exampleBroadcastReceiver,filter);
    }

//    @Override
//    protected void onStart() {
//        super.onStart();
//        IntentFilter filter = new IntentFilter(ConnectivityManager.CONNECTIVITY_ACTION);
//        registerReceiver(exampleBroadcastReceiver,filter);
//    }

//    @Override
//    protected void onStop() {
//        super.onStop();
//        unregisterReceiver(exampleBroadcastReceiver);
//    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
//        unregisterReceiver(exampleBroadcastReceiver);
        unregisterReceiver(orderedReceiver1);
    }
}
