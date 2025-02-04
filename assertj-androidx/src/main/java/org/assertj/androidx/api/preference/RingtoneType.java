package org.assertj.androidx.api.preference;

import android.media.RingtoneManager;
import androidx.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef(
    flag = true,
    value = {
        RingtoneManager.TYPE_ALARM,
        RingtoneManager.TYPE_NOTIFICATION,
        RingtoneManager.TYPE_RINGTONE
    }
)
@Retention(SOURCE)
@interface RingtoneType {
}
