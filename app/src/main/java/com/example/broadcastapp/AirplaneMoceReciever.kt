package com.example.broadcastapp

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.util.Log
import android.widget.Toast



class AirplaneMoceReciever : BroadcastReceiver() {
    override fun onReceive(context: Context?, intent: Intent?) {

        val isEnabled = intent?.getBooleanExtra("state", false) ?: return





    }
}