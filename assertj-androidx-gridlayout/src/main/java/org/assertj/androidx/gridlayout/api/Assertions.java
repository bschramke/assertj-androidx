// Copyright 2015 Square, Inc.
//
// This class is generated. Do not modify directly!
package org.assertj.androidx.gridlayout.api;

import org.assertj.androidx.gridlayout.api.widget.GridLayoutAssert;

/** Assertions for testing Android classes. */
@SuppressWarnings("deprecation")
public final class Assertions {
  public static GridLayoutAssert assertThat(
          androidx.gridlayout.widget.GridLayout actual) {
    return new GridLayoutAssert(actual);
  }

  private Assertions() {
    throw new AssertionError("No instances.");
  }
}
