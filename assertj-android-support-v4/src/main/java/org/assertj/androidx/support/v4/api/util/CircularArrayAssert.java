package org.assertj.androidx.support.v4.api.util;

import org.assertj.core.api.AbstractAssert;

import androidx.collection.CircularArray;

import static org.assertj.core.api.Assertions.assertThat;

public class CircularArrayAssert<E>
    extends AbstractAssert<CircularArrayAssert<E>, CircularArray<E>> {
  public CircularArrayAssert(CircularArray<E> actual) {
    super(actual, CircularArrayAssert.class);
  }

  public CircularArrayAssert<E> hasFirst(E first) {
    isNotNull();
    E actualFirst = actual.getFirst();
    assertThat(actualFirst) //
        .overridingErrorMessage("Expected to have first element <%s> but was <%s>.", first,
            actualFirst) //
        .isEqualTo(first);
    return this;
  }

  public CircularArrayAssert<E> hasLast(E last) {
    isNotNull();
    E actualLast = actual.getLast();
    assertThat(actualLast) //
        .overridingErrorMessage("Expected to have last element <%s> but was <%s>.", last,
            actualLast) //
        .isEqualTo(last);
    return this;
  }

  public CircularArrayAssert<E> isEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to be empty but was not.") //
        .isTrue();
    return this;
  }

  public CircularArrayAssert<E> isNotEmpty() {
    isNotNull();
    assertThat(actual.isEmpty()) //
        .overridingErrorMessage("Expected to not be empty but was.") //
        .isFalse();
    return this;
  }

  public CircularArrayAssert<E> hasSize(int size) {
    isNotNull();
    int actualSize = actual.size();
    assertThat(actualSize) //
        .overridingErrorMessage("Expected to have size <%s> but was <%s>.", size, actualSize) //
        .isEqualTo(size);
    return this;
  }
}
