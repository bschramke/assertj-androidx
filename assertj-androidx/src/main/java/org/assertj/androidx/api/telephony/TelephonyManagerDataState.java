package org.assertj.androidx.api.telephony;

import androidx.annotation.IntDef;
import android.telephony.TelephonyManager;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    TelephonyManager.DATA_CONNECTED,
    TelephonyManager.DATA_CONNECTING,
    TelephonyManager.DATA_DISCONNECTED,
    TelephonyManager.DATA_SUSPENDED
})
@Retention(SOURCE)
@interface TelephonyManagerDataState {
}
