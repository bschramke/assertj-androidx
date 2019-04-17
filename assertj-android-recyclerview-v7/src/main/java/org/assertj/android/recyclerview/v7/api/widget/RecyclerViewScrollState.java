package org.assertj.android.recyclerview.v7.api.widget;

import androidx.annotation.IntDef;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    RecyclerView.SCROLL_STATE_DRAGGING,
    RecyclerView.SCROLL_STATE_IDLE,
    RecyclerView.SCROLL_STATE_SETTLING,
})
@Retention(SOURCE)
@interface RecyclerViewScrollState {
}
