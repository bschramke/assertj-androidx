package org.assertj.androidx.api.view;

import androidx.annotation.IntDef;
import android.view.View;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    View.VISIBLE,
    View.INVISIBLE,
    View.GONE
})
@Retention(SOURCE)
@interface ViewVisibility {
}
