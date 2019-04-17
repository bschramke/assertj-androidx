package org.assertj.android.mediarouter.v7.api.media;

import androidx.annotation.IntDef;
import androidx.mediarouter.media.MediaSessionStatus;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    MediaSessionStatus.SESSION_STATE_ACTIVE,
    MediaSessionStatus.SESSION_STATE_ENDED,
    MediaSessionStatus.SESSION_STATE_INVALIDATED
})
@Retention(SOURCE)
@interface MediaSessionStatusState {
}
