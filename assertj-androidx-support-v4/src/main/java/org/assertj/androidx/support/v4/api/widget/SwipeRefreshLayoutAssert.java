package org.assertj.androidx.support.v4.api.widget;

import org.assertj.androidx.api.view.AbstractViewGroupAssert;

import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import static org.assertj.core.api.Assertions.assertThat;

public class SwipeRefreshLayoutAssert
    extends AbstractViewGroupAssert<SwipeRefreshLayoutAssert, SwipeRefreshLayout> {
  public SwipeRefreshLayoutAssert(SwipeRefreshLayout actual) {
    super(actual, SwipeRefreshLayoutAssert.class);
  }

  public SwipeRefreshLayoutAssert isRefreshing() {
    isNotNull();
    assertThat(actual.isRefreshing()) //
        .overridingErrorMessage("Expected to be refreshing but was not.") //
        .isTrue();
    return this;
  }

  public SwipeRefreshLayoutAssert isNotRefreshing() {
    isNotNull();
    assertThat(actual.isRefreshing()) //
        .overridingErrorMessage("Expected to not be refreshing but was.") //
        .isFalse();
    return this;
  }
}
