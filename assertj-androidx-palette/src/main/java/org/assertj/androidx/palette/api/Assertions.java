// Copyright 2015 Square, Inc.
//
// This class is generated. Do not modify directly!
package org.assertj.androidx.palette.api;

/** Assertions for testing Android classes. */
@SuppressWarnings("deprecation")
public final class Assertions {
  public static org.assertj.androidx.palette.api.graphics.PaletteAssert assertThat(
          androidx.palette.graphics.Palette actual) {
    return new org.assertj.androidx.palette.api.graphics.PaletteAssert(actual);
  }

  public static org.assertj.androidx.palette.api.graphics.PaletteSwatchAssert assertThat(
          androidx.palette.graphics.Palette.Swatch actual) {
    return new org.assertj.androidx.palette.api.graphics.PaletteSwatchAssert(actual);
  }

  private Assertions() {
    throw new AssertionError("No instances.");
  }
}
