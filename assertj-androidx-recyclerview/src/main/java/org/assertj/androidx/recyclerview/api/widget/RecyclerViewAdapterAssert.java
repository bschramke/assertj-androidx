package org.assertj.androidx.recyclerview.api.widget;

import org.assertj.core.api.AbstractAssert;

import androidx.recyclerview.widget.RecyclerView;

import static androidx.recyclerview.widget.RecyclerView.ViewHolder;
import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link RecyclerView.Adapter} instances. */
public class RecyclerViewAdapterAssert<VH extends ViewHolder>
    extends AbstractAssert<RecyclerViewAdapterAssert<VH>, RecyclerView.Adapter<VH>> {
  public RecyclerViewAdapterAssert(RecyclerView.Adapter<VH> actual) {
    super(actual, RecyclerViewAdapterAssert.class);
  }

  public RecyclerViewAdapterAssert<VH> hasItemCount(int count) {
    isNotNull();
    int actualCount = actual.getItemCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected item count <%s> but was <%s>.", count, actualCount) //
        .isEqualTo(count);
    return this;
  }

  public RecyclerViewAdapterAssert<VH> hasStableIds() {
    isNotNull();
    assertThat(actual.hasStableIds()) //
        .overridingErrorMessage("Expected to have stable IDs but did not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewAdapterAssert<VH> doesNotHaveStableIds() {
    isNotNull();
    assertThat(actual.hasStableIds()) //
        .overridingErrorMessage("Expected to not have stable IDs but did.") //
        .isFalse();
    return this;
  }

  public RecyclerViewAdapterAssert<VH> hasObservers() {
    isNotNull();
    assertThat(actual.hasObservers()) //
        .overridingErrorMessage("Expected to have observers but did not.") //
        .isTrue();
    return this;
  }

  public RecyclerViewAdapterAssert<VH> doesNotHaveObservers() {
    isNotNull();
    assertThat(actual.hasObservers()) //
        .overridingErrorMessage("Expected to not have observers but did.") //
        .isFalse();
    return this;
  }
}
