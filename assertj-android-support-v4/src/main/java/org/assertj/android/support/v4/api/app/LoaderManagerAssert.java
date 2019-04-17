// Copyright 2013 Square, Inc.
package org.assertj.android.support.v4.api.app;

import org.assertj.core.api.AbstractAssert;

import androidx.loader.app.LoaderManager;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link LoaderManager} instances. */
public class LoaderManagerAssert extends AbstractAssert<LoaderManagerAssert, LoaderManager> {
  public LoaderManagerAssert(LoaderManager actual) {
    super(actual, LoaderManagerAssert.class);
  }

  public LoaderManagerAssert hasLoader(int id) {
    isNotNull();
    assertThat(actual.getLoader(id))
        .overridingErrorMessage("Expected loader with ID <%s> but was not present.", id)
        .isNotNull();
    return this;
  }
}
