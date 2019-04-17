package org.assertj.androidx.api.view;

import androidx.annotation.IntDef;
import android.view.Display;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Display.STATE_DOZE,
    Display.STATE_DOZE_SUSPEND,
    Display.STATE_OFF,
    Display.STATE_ON,
    Display.STATE_UNKNOWN
})
@Retention(SOURCE)
@interface DisplayState {
}
