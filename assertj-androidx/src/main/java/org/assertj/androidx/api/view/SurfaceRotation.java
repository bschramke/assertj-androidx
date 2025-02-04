package org.assertj.androidx.api.view;

import androidx.annotation.IntDef;
import android.view.Surface;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Surface.ROTATION_0,
    Surface.ROTATION_90,
    Surface.ROTATION_180,
    Surface.ROTATION_270
})
@Retention(SOURCE)
@interface SurfaceRotation {
}
