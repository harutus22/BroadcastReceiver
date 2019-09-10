package com.example.broadcastreceiver;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Toast;

public class OrderedReceiver2 extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        int resultCode = getResultCode();
        String resultData = getResultData();
        Bundle resultBundle = getResultExtras(true);
        String extraString = resultBundle.getString("STRING_EXTRA");

        resultCode++;
        extraString += "->OR2";

        String toastText = "OR2\n" + "result code: " + resultCode +"\n" + "result data:" +
                resultData + "\n" + "String extra: " + extraString;


        Toast.makeText(context, toastText, Toast.LENGTH_LONG).show();

        resultData = "OR2";

        resultBundle.putString("STRING_EXTRA", extraString);

        setResult(resultCode, resultData, resultBundle);
    }
}
