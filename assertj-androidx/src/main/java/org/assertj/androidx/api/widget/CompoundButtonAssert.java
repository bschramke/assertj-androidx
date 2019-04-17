// Copyright 2013 Square, Inc.
package org.assertj.androidx.api.widget;

import android.widget.CompoundButton;

/**
 * Assertions for {@link CompoundButton} instances.
 * <p>
 * This class is final. To extend use {@link AbstractCompoundButtonAssert}.
 */
public final class CompoundButtonAssert
    extends AbstractCompoundButtonAssert<CompoundButtonAssert, CompoundButton> {
  public CompoundButtonAssert(CompoundButton actual) {
    super(actual, CompoundButtonAssert.class);
  }
}
