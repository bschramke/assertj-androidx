package org.assertj.androidx.api.bluetooth;

import android.bluetooth.BluetoothDevice;
import androidx.annotation.IntDef;
import java.lang.annotation.Retention;

import static java.lang.annotation.RetentionPolicy.SOURCE;

@IntDef({
    BluetoothDevice.BOND_NONE,
    BluetoothDevice.BOND_BONDING,
    BluetoothDevice.BOND_BONDED
})
@Retention(SOURCE)
@interface BluetoothDeviceBondState {
}
