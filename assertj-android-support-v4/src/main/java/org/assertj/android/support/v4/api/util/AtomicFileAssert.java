package org.assertj.android.support.v4.api.util;

import java.io.File;
import org.assertj.core.api.AbstractAssert;

import androidx.core.util.AtomicFile;

import static org.assertj.core.api.Assertions.assertThat;

public class AtomicFileAssert extends AbstractAssert<AtomicFileAssert, AtomicFile> {
  public AtomicFileAssert(AtomicFile actual) {
    super(actual, AtomicFileAssert.class);
  }

  public AtomicFileAssert hasBaseFile(File file) {
    isNotNull();
    File actualFile = actual.getBaseFile();
    assertThat(actualFile) //
        .overridingErrorMessage("Expected base file <%s> but was <%s>.", file, actualFile) //
        .isEqualTo(file);
    return this;
  }
}
