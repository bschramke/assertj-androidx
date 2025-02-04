package org.assertj.androidx.api.view.animation;

import androidx.annotation.IntDef;
import android.view.animation.GridLayoutAnimationController;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    GridLayoutAnimationController.PRIORITY_NONE,
    GridLayoutAnimationController.PRIORITY_COLUMN,
    GridLayoutAnimationController.PRIORITY_ROW
})
@Retention(SOURCE)
@interface GridLayoutAnimationControllerDirectionPriority {
}
