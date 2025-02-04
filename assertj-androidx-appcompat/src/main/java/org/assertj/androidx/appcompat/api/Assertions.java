// Copyright 2015 Square, Inc.
//
// This class is generated. Do not modify directly!
package org.assertj.androidx.appcompat.api;

/** Assertions for testing Android classes. */
@SuppressWarnings("deprecation")
public final class Assertions {
  public static org.assertj.androidx.appcompat.api.app.ActionBarAssert assertThat(
      androidx.appcompat.app.ActionBar actual) {
    return new org.assertj.androidx.appcompat.api.app.ActionBarAssert(actual);
  }

  public static org.assertj.androidx.appcompat.api.view.ActionModeAssert assertThat(
      androidx.appcompat.view.ActionMode actual) {
    return new org.assertj.androidx.appcompat.api.view.ActionModeAssert(actual);
  }

  public static org.assertj.androidx.appcompat.api.widget.LinearLayoutCompatAssert assertThat(
      androidx.appcompat.widget.LinearLayoutCompat actual) {
    return new org.assertj.androidx.appcompat.api.widget.LinearLayoutCompatAssert(actual);
  }

  public static org.assertj.androidx.appcompat.api.widget.SearchViewAssert assertThat(
      androidx.appcompat.widget.SearchView actual) {
    return new org.assertj.androidx.appcompat.api.widget.SearchViewAssert(actual);
  }

  private Assertions() {
    throw new AssertionError("No instances.");
  }
}
