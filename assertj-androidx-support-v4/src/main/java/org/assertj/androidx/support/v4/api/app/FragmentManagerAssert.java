// Copyright 2013 Square, Inc.
package org.assertj.androidx.support.v4.api.app;

import androidx.fragment.app.FragmentManager;
import org.assertj.core.api.AbstractAssert;

import static org.assertj.core.api.Assertions.assertThat;

/** Assertions for {@link FragmentManager} instances. */
public class FragmentManagerAssert extends AbstractAssert<FragmentManagerAssert, FragmentManager> {
  public FragmentManagerAssert(FragmentManager actual) {
    super(actual, FragmentManagerAssert.class);
  }

  public FragmentManagerAssert hasFragmentWithId(int id) {
    isNotNull();
    assertThat(actual.findFragmentById(id)) //
        .overridingErrorMessage("Expected fragment with ID <%d> but was not found.", id) //
        .isNotNull();
    return this;
  }

  public FragmentManagerAssert hasFragmentWithTag(String tag) {
    isNotNull();
    assertThat(actual.findFragmentByTag(tag)) //
        .overridingErrorMessage("Expected fragment with tag <%s> but was not found.", tag) //
        .isNotNull();
    return this;
  }

  public FragmentManagerAssert hasBackStackEntryCount(int count) {
    isNotNull();
    int actualCount = actual.getBackStackEntryCount();
    assertThat(actualCount) //
        .overridingErrorMessage("Expected back stack entry count <%s> but was <%s>.", count,
            actualCount) //
        .isEqualTo(count);
    return this;
  }

  public FragmentManagerAssert doesNotHaveFragmentWithId(int id) {
    isNotNull();
    assertThat(actual.findFragmentById(id))
        .overridingErrorMessage("Expected fragment with ID <%s> not to be present but was.", id)
        .isNull();
    return this;
  }

  public FragmentManagerAssert doesNotHaveFragmentWithTag(String tag) {
    isNotNull();
    assertThat(actual.findFragmentByTag(tag))
        .overridingErrorMessage("Expected fragment with tag <%s> not to be present but was.", tag)
        .isNull();
    return this;
  }
}
