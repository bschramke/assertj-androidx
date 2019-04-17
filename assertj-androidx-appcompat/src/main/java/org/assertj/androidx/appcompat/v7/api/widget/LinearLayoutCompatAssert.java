package org.assertj.androidx.appcompat.v7.api.widget;


import androidx.appcompat.widget.LinearLayoutCompat;

/**
 * Assertions for {@link LinearLayoutCompat} instances.
 * <p>
 * This class is final. To extend use {@link AbstractLinearLayoutCompatAssert}.
 */
public final class LinearLayoutCompatAssert extends
    AbstractLinearLayoutCompatAssert<LinearLayoutCompatAssert, LinearLayoutCompat> {
  public LinearLayoutCompatAssert(LinearLayoutCompat actual) {
    super(actual, LinearLayoutCompatAssert.class);
  }
}
