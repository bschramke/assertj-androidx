// Copyright 2016 Square, Inc.
//
// This class is generated. Do not modify directly!
package org.assertj.androidx.material.api;

import org.assertj.androidx.material.api.navigation.NavigationViewAssert;
import org.assertj.androidx.material.api.snackbar.SnackbarAssert;
import org.assertj.androidx.material.api.tabs.TabAssert;
import org.assertj.androidx.material.api.tabs.TabLayoutAssert;
import org.assertj.androidx.material.api.textfield.TextInputLayoutAssert;

/** Assertions for testing Android classes. */
@SuppressWarnings("deprecation")
public final class Assertions {
  public static NavigationViewAssert assertThat(
          com.google.android.material.navigation.NavigationView actual) {
    return new NavigationViewAssert(actual);
  }

  public static SnackbarAssert assertThat(
          com.google.android.material.snackbar.Snackbar actual) {
    return new SnackbarAssert(actual);
  }

  public static TabAssert assertThat(
          com.google.android.material.tabs.TabLayout.Tab actual) {
    return new TabAssert(actual);
  }

  public static TabLayoutAssert assertThat(
          com.google.android.material.tabs.TabLayout actual) {
    return new TabLayoutAssert(actual);
  }

  public static TextInputLayoutAssert assertThat(
          com.google.android.material.textfield.TextInputLayout actual) {
    return new TextInputLayoutAssert(actual);
  }

  private Assertions() {
    throw new AssertionError("No instances.");
  }
}
