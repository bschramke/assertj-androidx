package org.assertj.androidx.material.api.widget;

import com.google.android.material.tabs.TabLayout;

import java.lang.annotation.Retention;

import androidx.annotation.IntDef;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    TabLayout.MODE_FIXED,
    TabLayout.MODE_SCROLLABLE
})
@Retention(SOURCE)
@interface TabMode {
}
