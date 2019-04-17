package org.assertj.androidx.mediarouter.v7.api.media;

import androidx.annotation.IntDef;
import androidx.mediarouter.media.MediaItemStatus;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    MediaItemStatus.PLAYBACK_STATE_BUFFERING,
    MediaItemStatus.PLAYBACK_STATE_CANCELED,
    MediaItemStatus.PLAYBACK_STATE_ERROR,
    MediaItemStatus.PLAYBACK_STATE_FINISHED,
    MediaItemStatus.PLAYBACK_STATE_INVALIDATED,
    MediaItemStatus.PLAYBACK_STATE_PAUSED,
    MediaItemStatus.PLAYBACK_STATE_PENDING,
    MediaItemStatus.PLAYBACK_STATE_PLAYING
})
@Retention(SOURCE)
@interface MediaItemStatusPlaybackState {
}
