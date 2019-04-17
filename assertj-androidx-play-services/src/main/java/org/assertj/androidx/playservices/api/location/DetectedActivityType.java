package org.assertj.androidx.playservices.api.location;

import com.google.android.gms.location.DetectedActivity;
import java.lang.annotation.Retention;

import androidx.annotation.IntDef;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    DetectedActivity.IN_VEHICLE,
    DetectedActivity.ON_BICYCLE,
    DetectedActivity.ON_FOOT,
    DetectedActivity.RUNNING,
    DetectedActivity.STILL,
    DetectedActivity.TILTING,
    DetectedActivity.UNKNOWN,
    DetectedActivity.WALKING
})
@Retention(SOURCE)
@interface DetectedActivityType {
}
