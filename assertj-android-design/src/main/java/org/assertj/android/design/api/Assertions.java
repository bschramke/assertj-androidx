// Copyright 2016 Square, Inc.
//
// This class is generated. Do not modify directly!
package org.assertj.android.design.api;

/** Assertions for testing Android classes. */
@SuppressWarnings("deprecation")
public final class Assertions {
  public static org.assertj.android.design.api.widget.NavigationViewAssert assertThat(
          com.google.android.material.navigation.NavigationView actual) {
    return new org.assertj.android.design.api.widget.NavigationViewAssert(actual);
  }

  public static org.assertj.android.design.api.widget.SnackbarAssert assertThat(
          com.google.android.material.snackbar.Snackbar actual) {
    return new org.assertj.android.design.api.widget.SnackbarAssert(actual);
  }

  public static org.assertj.android.design.api.widget.TabAssert assertThat(
          com.google.android.material.tabs.TabLayout.Tab actual) {
    return new org.assertj.android.design.api.widget.TabAssert(actual);
  }

  public static org.assertj.android.design.api.widget.TabLayoutAssert assertThat(
          com.google.android.material.tabs.TabLayout actual) {
    return new org.assertj.android.design.api.widget.TabLayoutAssert(actual);
  }

  public static org.assertj.android.design.api.widget.TextInputLayoutAssert assertThat(
          com.google.android.material.textfield.TextInputLayout actual) {
    return new org.assertj.android.design.api.widget.TextInputLayoutAssert(actual);
  }

  private Assertions() {
    throw new AssertionError("No instances.");
  }
}
