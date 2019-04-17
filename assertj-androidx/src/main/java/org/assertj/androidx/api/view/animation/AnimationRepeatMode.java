package org.assertj.androidx.api.view.animation;

import androidx.annotation.IntDef;
import android.view.animation.Animation;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Animation.RESTART,
    Animation.REVERSE
})
@Retention(SOURCE)
@interface AnimationRepeatMode {
}
