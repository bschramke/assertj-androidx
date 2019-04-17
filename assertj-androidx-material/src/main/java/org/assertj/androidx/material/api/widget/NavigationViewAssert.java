package org.assertj.androidx.material.api.widget;

import android.graphics.drawable.Drawable;

import com.google.android.material.navigation.NavigationView;

import org.assertj.androidx.api.widget.AbstractFrameLayoutAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link NavigationView} instances. */
public class NavigationViewAssert
    extends AbstractFrameLayoutAssert<NavigationViewAssert, NavigationView> {
  public NavigationViewAssert(NavigationView actual) {
    super(actual, NavigationViewAssert.class);
  }

  public NavigationViewAssert hasItemBackground(Drawable itemBackground) {
    isNotNull();
    Drawable actualItemBackground = actual.getItemBackground();
    assertThat(actualItemBackground) //
        .overridingErrorMessage("Expected item background <%s> but was <%s>.", itemBackground,
            actualItemBackground) //
        .isEqualTo(itemBackground);
    return this;
  }
}
