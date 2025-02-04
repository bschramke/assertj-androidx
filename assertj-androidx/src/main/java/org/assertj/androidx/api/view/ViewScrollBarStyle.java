package org.assertj.androidx.api.view;

import androidx.annotation.IntDef;
import android.view.View;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    View.SCROLLBARS_INSIDE_INSET,
    View.SCROLLBARS_INSIDE_OVERLAY,
    View.SCROLLBARS_OUTSIDE_INSET,
    View.SCROLLBARS_OUTSIDE_OVERLAY
})
@Retention(SOURCE)
@interface ViewScrollBarStyle {
}
