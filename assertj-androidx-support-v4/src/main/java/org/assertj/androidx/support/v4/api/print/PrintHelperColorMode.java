package org.assertj.androidx.support.v4.api.print;

import androidx.annotation.IntDef;
import androidx.print.PrintHelper;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    PrintHelper.COLOR_MODE_COLOR,
    PrintHelper.COLOR_MODE_MONOCHROME
})
@Retention(SOURCE)
@interface PrintHelperColorMode {
}
