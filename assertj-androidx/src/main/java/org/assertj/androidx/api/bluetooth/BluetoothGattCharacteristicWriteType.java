package org.assertj.androidx.api.bluetooth;

import android.bluetooth.BluetoothGattCharacteristic;
import androidx.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    BluetoothGattCharacteristic.WRITE_TYPE_DEFAULT,
    BluetoothGattCharacteristic.WRITE_TYPE_NO_RESPONSE,
    BluetoothGattCharacteristic.WRITE_TYPE_SIGNED
})
@Retention(SOURCE)
@interface BluetoothGattCharacteristicWriteType {
}
