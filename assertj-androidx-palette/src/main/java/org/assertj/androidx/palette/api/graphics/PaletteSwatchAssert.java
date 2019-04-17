package org.assertj.androidx.palette.api.graphics;


import org.assertj.core.api.AbstractAssert;

import androidx.palette.graphics.Palette;

import static org.assertj.core.api.Assertions.assertThat;

/**
 * Assertions for {@link Palette.Swatch} instances.
 */
public class PaletteSwatchAssert extends AbstractAssert<PaletteSwatchAssert, Palette.Swatch> {
  public PaletteSwatchAssert(Palette.Swatch actual) {
    super(actual, PaletteSwatchAssert.class);
  }

  public PaletteSwatchAssert hasRgb(int rgb) {
    isNotNull();
    int actualRgb = actual.getRgb();
    assertThat(actualRgb) //
        .overridingErrorMessage("Expected RGB <%s> but was <%s>", rgb, actualRgb) //
        .isEqualTo(rgb);
    return this;
  }
}
