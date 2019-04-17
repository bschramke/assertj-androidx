package org.assertj.androidx.api.widget;

import androidx.annotation.IntDef;
import android.widget.ListPopupWindow;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    ListPopupWindow.INPUT_METHOD_FROM_FOCUSABLE,
    ListPopupWindow.INPUT_METHOD_NEEDED,
    ListPopupWindow.INPUT_METHOD_NOT_NEEDED
})
@Retention(SOURCE)
@interface ListPopupWindowInputMethodMode {
}
