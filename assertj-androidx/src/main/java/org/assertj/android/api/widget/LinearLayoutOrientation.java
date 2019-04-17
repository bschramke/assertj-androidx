package org.assertj.android.api.widget;

import androidx.annotation.IntDef;
import android.widget.LinearLayout;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    LinearLayout.HORIZONTAL,
    LinearLayout.VERTICAL
})
@Retention(SOURCE)
public @interface LinearLayoutOrientation {
}
