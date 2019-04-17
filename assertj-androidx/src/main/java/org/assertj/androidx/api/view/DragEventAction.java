package org.assertj.androidx.api.view;

import androidx.annotation.IntDef;
import android.view.DragEvent;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    DragEvent.ACTION_DRAG_ENDED,
    DragEvent.ACTION_DRAG_ENTERED,
    DragEvent.ACTION_DRAG_EXITED,
    DragEvent.ACTION_DRAG_LOCATION,
    DragEvent.ACTION_DRAG_STARTED,
    DragEvent.ACTION_DROP
})
@Retention(SOURCE)
@interface DragEventAction {
}
