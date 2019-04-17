package org.assertj.androidx.support.v4.api.print;

import androidx.annotation.IntDef;
import androidx.print.PrintHelper;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    PrintHelper.ORIENTATION_LANDSCAPE,
    PrintHelper.ORIENTATION_PORTRAIT
})
@Retention(SOURCE)
@interface PrintHelperOrientation {
}
