package fr.strategfirst.callguard

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.telephony.TelephonyManager

@Suppress("DEPRECATION")
internal class PhoneCallHandler() : BroadcastReceiver() {

    override fun onReceive(context: Context, intent: Intent) {
        val state: String = intent.getStringExtra(TelephonyManager.EXTRA_STATE)!!

        val number: String = try {

            intent.getStringExtra(TelephonyManager.EXTRA_INCOMING_NUMBER)!!

        } catch (e: Error) {

            "failed"

        }

        when (state) {

            TelephonyManager.EXTRA_STATE_IDLE -> println(number)

            TelephonyManager.EXTRA_STATE_RINGING -> println(number)

            TelephonyManager.EXTRA_STATE_OFFHOOK -> println(number)

        }

    }
}