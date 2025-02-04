package org.assertj.androidx.recyclerview.api.widget;

import androidx.recyclerview.widget.RecyclerView;
import org.assertj.androidx.api.view.AbstractViewGroupAssert;

import static androidx.recyclerview.widget.RecyclerView.Adapter;
import static androidx.recyclerview.widget.RecyclerView.ItemAnimator;
import static androidx.recyclerview.widget.RecyclerView.LayoutManager;
import static androidx.recyclerview.widget.RecyclerView.RecycledViewPool;
import static androidx.recyclerview.widget.RecyclerView.SCROLL_STATE_DRAGGING;
import static androidx.recyclerview.widget.RecyclerView.SCROLL_STATE_IDLE;
import static androidx.recyclerview.widget.RecyclerView.SCROLL_STATE_SETTLING;
import static androidx.recyclerview.widget.RecyclerView.ViewHolder;
import static org.assertj.androidx.internal.BitmaskUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link RecyclerView} instances. */
public class RecyclerViewAssert extends AbstractViewGroupAssert<RecyclerViewAssert, RecyclerView> {
  public RecyclerViewAssert(RecyclerView actual) {
    super(actual, RecyclerViewAssert.class);
  }

  public <VH extends ViewHolder> RecyclerViewAssert hasAdapter(Adapter<VH> adapter) {
    isNotNull();
    Adapter actualAdapter = actual.getAdapter();
    assertThat(actualAdapter) //
        .overridingErrorMessage("Expected adapter <%s> but was <%s>.", adapter, actualAdapter) //
        .isEqualTo(adapter);
    return this;
  }

  public RecyclerViewAssert hasItemAnimator(ItemAnimator itemAnimator) {
    isNotNull();
    ItemAnimator actualItemAnimator = actual.getItemAnimator();
    assertThat(actualItemAnimator) //
        .overridingErrorMessage("Expected item animator <%s> but was <%s>.", itemAnimator,
            actualItemAnimator) //
        .isEqualTo(itemAnimator);
    return this;
  }

  public RecyclerViewAssert hasLayoutManager(LayoutManager layoutManager) {
    isNotNull();
    LayoutManager actualLayoutManager = actual.getLayoutManager();
    assertThat(actualLayoutManager) //
        .overridingErrorMessage("Expected layout manager <%s> but was <%s>.", layoutManager,
            actualLayoutManager) //
        .isEqualTo(layoutManager);
    return this;
  }

  public RecyclerViewAssert hasRecycledViewPool(RecycledViewPool recycledViewPool) {
    isNotNull();
    RecycledViewPool actualRecycledViewPool = actual.getRecycledViewPool();
    assertThat(actualRecycledViewPool) //
        .overridingErrorMessage("Expected recycled view pool <%s> but was <%s>", recycledViewPool,
            actualRecycledViewPool) //
        .isEqualTo(recycledViewPool);
    return this;
  }

  public RecyclerViewAssert hasScrollState(@RecyclerViewScrollState int scrollState) {
    isNotNull();
    int actualScrollState = actual.getScrollState();
    //noinspection ResourceType
    assertThat(actualScrollState) //
        .overridingErrorMessage("Expected scroll state <%s> but was <%s>.",
            scrollStateToString(scrollState), scrollStateToString(actualScrollState)) //
        .isEqualTo(scrollState);
    return this;
  }

  public RecyclerViewAssert hasFixedSize() {
    isNotNull();
    assertThat(actual.hasFixedSize()) //
        .overridingErrorMessage("Expected to have fixed size but did not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewAssert doesNotHaveFixedSize() {
    isNotNull();
    assertThat(actual.hasFixedSize()) //
        .overridingErrorMessage("Expected to not have fixed size but did.") //
        .isFalse();
    return this;
  }

  public static String scrollStateToString(@RecyclerViewScrollState int scrollState) {
    return buildNamedValueString(scrollState)
        .value(SCROLL_STATE_DRAGGING, "dragging")
        .value(SCROLL_STATE_IDLE, "idle")
        .value(SCROLL_STATE_SETTLING, "settling")
        .get();
  }
}
