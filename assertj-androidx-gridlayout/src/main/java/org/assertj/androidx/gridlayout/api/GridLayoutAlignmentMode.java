package org.assertj.androidx.gridlayout.api;

import java.lang.annotation.Retention;

import androidx.annotation.IntDef;
import androidx.gridlayout.widget.GridLayout;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    GridLayout.ALIGN_BOUNDS,
    GridLayout.ALIGN_MARGINS
})
@Retention(SOURCE)
@interface GridLayoutAlignmentMode {
}
