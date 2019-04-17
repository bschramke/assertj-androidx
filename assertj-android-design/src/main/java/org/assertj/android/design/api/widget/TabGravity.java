package org.assertj.android.design.api.widget;

import com.google.android.material.tabs.TabLayout;

import java.lang.annotation.Retention;

import androidx.annotation.IntDef;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    TabLayout.GRAVITY_CENTER,
    TabLayout.GRAVITY_FILL
})
@Retention(SOURCE)
@interface TabGravity {
}
