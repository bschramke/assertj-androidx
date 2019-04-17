package org.assertj.androidx.api.widget;

import androidx.annotation.IntDef;
import android.widget.GridLayout;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    GridLayout.HORIZONTAL,
    GridLayout.VERTICAL
})
@Retention(SOURCE)
@interface GridLayoutOrientation {
}
