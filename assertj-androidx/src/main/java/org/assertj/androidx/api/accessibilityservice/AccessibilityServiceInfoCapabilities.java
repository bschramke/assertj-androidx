package org.assertj.androidx.api.accessibilityservice;

import android.accessibilityservice.AccessibilityServiceInfo;
import java.lang.annotation.Retention;

import androidx.annotation.IntDef;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef(
    flag = true,
    value = {
        AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_ENHANCED_WEB_ACCESSIBILITY,
        AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_FILTER_KEY_EVENTS,
        AccessibilityServiceInfo.CAPABILITY_CAN_REQUEST_TOUCH_EXPLORATION,
        AccessibilityServiceInfo.CAPABILITY_CAN_RETRIEVE_WINDOW_CONTENT
    }
)
@Retention(SOURCE)
@interface AccessibilityServiceInfoCapabilities {
}
