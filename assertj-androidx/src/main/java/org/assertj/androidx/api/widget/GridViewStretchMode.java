package org.assertj.androidx.api.widget;

import androidx.annotation.IntDef;
import android.widget.GridView;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    GridView.NO_STRETCH,
    GridView.STRETCH_SPACING,
    GridView.STRETCH_SPACING_UNIFORM,
    GridView.STRETCH_COLUMN_WIDTH
})
@Retention(SOURCE)
@interface GridViewStretchMode {
}
