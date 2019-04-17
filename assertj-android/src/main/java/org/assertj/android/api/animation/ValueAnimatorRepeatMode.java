package org.assertj.android.api.animation;

import android.animation.ValueAnimator;
import androidx.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    ValueAnimator.RESTART,
    ValueAnimator.REVERSE
})
@Retention(SOURCE)
@interface ValueAnimatorRepeatMode {
}
