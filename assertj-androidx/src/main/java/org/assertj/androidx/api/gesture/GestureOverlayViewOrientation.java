package org.assertj.androidx.api.gesture;

import android.gesture.GestureOverlayView;
import androidx.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    GestureOverlayView.ORIENTATION_HORIZONTAL,
    GestureOverlayView.ORIENTATION_VERTICAL
})
@Retention(SOURCE)
@interface GestureOverlayViewOrientation {
}
