package org.assertj.androidx.api.app;

import android.app.Notification;
import androidx.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Notification.PRIORITY_MIN,
    Notification.PRIORITY_LOW,
    Notification.PRIORITY_DEFAULT,
    Notification.PRIORITY_HIGH,
    Notification.PRIORITY_MAX
})
@Retention(SOURCE)
@interface NotificationPriority {
}
