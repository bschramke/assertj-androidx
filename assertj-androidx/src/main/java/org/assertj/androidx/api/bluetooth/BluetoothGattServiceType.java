package org.assertj.androidx.api.bluetooth;

import android.bluetooth.BluetoothGattService;
import androidx.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    BluetoothGattService.SERVICE_TYPE_PRIMARY,
    BluetoothGattService.SERVICE_TYPE_SECONDARY
})
@Retention(SOURCE)
@interface BluetoothGattServiceType {
}
