package org.assertj.androidx.material.api.textfield;

import com.google.android.material.textfield.TextInputLayout;

import org.assertj.androidx.api.widget.AbstractLinearLayoutAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link TextInputLayout} instances. */
public class TextInputLayoutAssert extends AbstractLinearLayoutAssert<TextInputLayoutAssert, TextInputLayout> {
  public TextInputLayoutAssert(TextInputLayout actual) {
    super(actual, TextInputLayoutAssert.class);
  }

  public TextInputLayoutAssert hasError(CharSequence error) {
    isNotNull();
    CharSequence actualError = actual.getError();

    assertThat(actualError) //
        .overridingErrorMessage("Expected error '<%s>' but was '<%s>'.", error, actualError) //
        .isEqualTo(error);
    return this;
  }
}
