package com.test.test;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.telephony.TelephonyManager;

public class PhonecallHandler extends BroadcastReceiver {

	@override
	public void onReceive(Context context, Intent intent) {
		String stateStr = intent.getExtras().getString(TelephonyManager.EXTRA_STATE);
		String number = intent.getExtras().getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
		if(stateStr.equals(TelephonyManager.EXTRA_STATE_RINGING)){
                	// Something must be done here
            	}
	}

}
