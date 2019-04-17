package org.assertj.androidx.support.v4.api.print;

import androidx.annotation.IntDef;
import androidx.print.PrintHelper;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    PrintHelper.SCALE_MODE_FILL,
    PrintHelper.SCALE_MODE_FIT
})
@Retention(SOURCE)
@interface PrintHelperScaleMode {
}
