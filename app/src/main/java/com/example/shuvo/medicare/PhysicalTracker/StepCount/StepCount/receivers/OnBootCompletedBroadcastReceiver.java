package com.example.shuvo.medicare.PhysicalTracker.StepCount.StepCount.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import com.example.shuvo.medicare.PhysicalTracker.StepCount.StepCount.utils.StepDetectionServiceHelper;


/**
 * Receives the on boot complete broadcast and starts
 * the step detection and it's required services if
 * step detection is enabled.
 */
public class OnBootCompletedBroadcastReceiver extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent) {
        StepDetectionServiceHelper.startAllIfEnabled(context);
    }
}
