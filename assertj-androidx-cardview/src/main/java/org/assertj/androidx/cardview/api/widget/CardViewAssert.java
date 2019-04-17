package org.assertj.androidx.cardview.api.widget;


import org.assertj.androidx.api.view.AbstractViewGroupAssert;

import androidx.cardview.widget.CardView;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Assertions for {@link CardView} instances.
 */
public class CardViewAssert extends AbstractViewGroupAssert<CardViewAssert, CardView> {
  public CardViewAssert(CardView actual) {
    super(actual, CardViewAssert.class);
  }

  public CardViewAssert hasRadius(int radius) {
    isNotNull();
    float actualRadius = actual.getRadius();
    assertThat(actualRadius) //
            .overridingErrorMessage("Expected radius <%s> but was <%s>", radius, actualRadius) //
            .isEqualTo(radius);
    return this;
  }
}
