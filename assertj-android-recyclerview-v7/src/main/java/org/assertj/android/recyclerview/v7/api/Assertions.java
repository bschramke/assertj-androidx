// Copyright 2015 Square, Inc.
//
// This class is generated. Do not modify directly!
package org.assertj.android.recyclerview.v7.api;

/** Assertions for testing Android classes. */
@SuppressWarnings("deprecation")
public final class Assertions {
  public static <VH extends androidx.recyclerview.widget.RecyclerView.ViewHolder> org.assertj.android.recyclerview.v7.api.widget.RecyclerViewAdapterAssert<VH> assertThat(
      androidx.recyclerview.widget.RecyclerView.Adapter<VH> actual) {
    return new org.assertj.android.recyclerview.v7.api.widget.RecyclerViewAdapterAssert<>(actual);
  }

  public static org.assertj.android.recyclerview.v7.api.widget.RecyclerViewAssert assertThat(
      androidx.recyclerview.widget.RecyclerView actual) {
    return new org.assertj.android.recyclerview.v7.api.widget.RecyclerViewAssert(actual);
  }

  public static org.assertj.android.recyclerview.v7.api.widget.RecyclerViewItemAnimatorAssert assertThat(
      androidx.recyclerview.widget.RecyclerView.ItemAnimator actual) {
    return new org.assertj.android.recyclerview.v7.api.widget.RecyclerViewItemAnimatorAssert(actual);
  }

  public static org.assertj.android.recyclerview.v7.api.widget.RecyclerViewLayoutManagerAssert assertThat(
      androidx.recyclerview.widget.RecyclerView.LayoutManager actual) {
    return new org.assertj.android.recyclerview.v7.api.widget.RecyclerViewLayoutManagerAssert(actual);
  }

  public static org.assertj.android.recyclerview.v7.api.widget.RecyclerViewLayoutParamsAssert assertThat(
      androidx.recyclerview.widget.RecyclerView.LayoutParams actual) {
    return new org.assertj.android.recyclerview.v7.api.widget.RecyclerViewLayoutParamsAssert(actual);
  }

  public static org.assertj.android.recyclerview.v7.api.widget.RecyclerViewSmoothScrollerActionAssert assertThat(
      androidx.recyclerview.widget.RecyclerView.SmoothScroller.Action actual) {
    return new org.assertj.android.recyclerview.v7.api.widget.RecyclerViewSmoothScrollerActionAssert(actual);
  }

  public static org.assertj.android.recyclerview.v7.api.widget.RecyclerViewSmoothScrollerAssert assertThat(
      androidx.recyclerview.widget.RecyclerView.SmoothScroller actual) {
    return new org.assertj.android.recyclerview.v7.api.widget.RecyclerViewSmoothScrollerAssert(actual);
  }

  public static org.assertj.android.recyclerview.v7.api.widget.RecyclerViewViewHolderAssert assertThat(
      androidx.recyclerview.widget.RecyclerView.ViewHolder actual) {
    return new org.assertj.android.recyclerview.v7.api.widget.RecyclerViewViewHolderAssert(actual);
  }

  private Assertions() {
    throw new AssertionError("No instances.");
  }
}
