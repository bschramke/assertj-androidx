package org.assertj.androidx.api.location;

import android.location.Criteria;
import androidx.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    Criteria.ACCURACY_COARSE,
    Criteria.ACCURACY_FINE
})
@Retention(SOURCE)
@interface CriteriaAccuracyRequirement {
}
