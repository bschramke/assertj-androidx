package org.assertj.androidx.api.location;

import android.location.Criteria;
import androidx.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Criteria.ACCURACY_LOW,
    Criteria.ACCURACY_MEDIUM,
    Criteria.ACCURACY_HIGH
})
@Retention(SOURCE)
@interface CriteriaAccuracy {
}
