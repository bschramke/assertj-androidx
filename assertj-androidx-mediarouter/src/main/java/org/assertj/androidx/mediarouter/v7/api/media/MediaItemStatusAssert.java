package org.assertj.androidx.mediarouter.v7.api.media;

import org.assertj.core.api.AbstractAssert;

import androidx.mediarouter.media.MediaItemStatus;

import static androidx.mediarouter.media.MediaItemStatus.PLAYBACK_STATE_BUFFERING;
import static androidx.mediarouter.media.MediaItemStatus.PLAYBACK_STATE_CANCELED;
import static androidx.mediarouter.media.MediaItemStatus.PLAYBACK_STATE_ERROR;
import static androidx.mediarouter.media.MediaItemStatus.PLAYBACK_STATE_FINISHED;
import static androidx.mediarouter.media.MediaItemStatus.PLAYBACK_STATE_INVALIDATED;
import static androidx.mediarouter.media.MediaItemStatus.PLAYBACK_STATE_PAUSED;
import static androidx.mediarouter.media.MediaItemStatus.PLAYBACK_STATE_PENDING;
import static androidx.mediarouter.media.MediaItemStatus.PLAYBACK_STATE_PLAYING;
import static org.assertj.androidx.internal.BitmaskUtils.buildNamedValueString;
import static org.assertj.core.api.Assertions.assertThat;

public class MediaItemStatusAssert extends AbstractAssert<MediaItemStatusAssert, MediaItemStatus> {
  public MediaItemStatusAssert(MediaItemStatus actual) {
    super(actual, MediaItemStatusAssert.class);
  }

  public MediaItemStatusAssert hasContentDuration(long duration) {
    isNotNull();
    long actualDuration = actual.getContentDuration();
    assertThat(actualDuration) //
        .overridingErrorMessage("Expected content duration <%s> but was <%s>.", duration,
            actualDuration) //
        .isEqualTo(duration);
    return this;
  }

  public MediaItemStatusAssert hasContentPosition(long position) {
    isNotNull();
    long actualPosition = actual.getContentPosition();
    assertThat(actualPosition) //
        .overridingErrorMessage("Expected content position <%s> but was <%s>.", position,
            actualPosition) //
        .isEqualTo(position);
    return this;
  }

  public MediaItemStatusAssert hasPlaybackState(@MediaItemStatusPlaybackState int state) {
    isNotNull();
    int actualState = actual.getPlaybackState();
    //noinspection ResourceType
    assertThat(actualState) //
        .overridingErrorMessage("Expected playback state <%s> but was <%s>.",
            playbackStateToString(state), playbackStateToString(actualState)) //
        .isEqualTo(state);
    return this;
  }

  public MediaItemStatusAssert hasTimestamp(long timestamp) {
    isNotNull();
    long actualTimestamp = actual.getTimestamp();
    assertThat(actualTimestamp) //
        .overridingErrorMessage("Expected timestamp <%s> but was <%s>.", timestamp, actualTimestamp)
        .isEqualTo(timestamp);
    return this;
  }

  public static String playbackStateToString(@MediaItemStatusPlaybackState int playbackState) {
    return buildNamedValueString(playbackState)
        .value(PLAYBACK_STATE_BUFFERING, "buffering")
        .value(PLAYBACK_STATE_CANCELED, "canceled")
        .value(PLAYBACK_STATE_ERROR, "error")
        .value(PLAYBACK_STATE_FINISHED, "finished")
        .value(PLAYBACK_STATE_INVALIDATED, "invalidated")
        .value(PLAYBACK_STATE_PAUSED, "paused")
        .value(PLAYBACK_STATE_PENDING, "pending")
        .value(PLAYBACK_STATE_PLAYING, "playing")
        .get();
  }
}
