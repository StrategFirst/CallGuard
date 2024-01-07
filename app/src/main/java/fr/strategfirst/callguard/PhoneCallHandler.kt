package fr.strategfirst.callguard

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager


class PhoneCallHandler: BroadcastReceiver() {

    override fun onReceive(context: Context?, intent: Intent?) {
        val state: String? = intent?.extras?.getString(TelephonyManager.EXTRA_STATE);
        val number: String? = intent?.extras?.getString(TelephonyManager.EXTRA_INCOMING_NUMBER);
        if(
            state.equals(TelephonyManager.EXTRA_STATE_RINGING)
            && state != null
            && number != null
            ) {
            this.handleIncomingCall(number);
        }
    }

    private fun handleIncomingCall(number: String) {
        println(number);
        TODO();
    }
}