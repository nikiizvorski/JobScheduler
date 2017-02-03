package com.nikiizvorski.jobscheduler.service.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.nikiizvorski.jobscheduler.service.services.StartedService;

public class IntentReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, StartedService.class);
        context.startService(i);
    }
}
