package com.example.attendance;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanResult;
import android.util.Log;
import android.widget.Toast;

import java.util.List;

public class scan1 {

    BluetoothAdapter adapter = BluetoothAdapter.getDefaultAdapter();
    BluetoothLeScanner scanner = adapter.getBluetoothLeScanner();


    private final ScanCallback scanCallback = new ScanCallback() {
        @Override
        public void onScanResult(int callbackType, ScanResult result) {
            BluetoothDevice device = result.getDevice();
            // ...do whatever you want with this found device
        }

        @Override
        public void onBatchScanResults(List<ScanResult> results) {
            // Ignore for now
        }

        @Override
        public void onScanFailed(int errorCode) {
            // Ignore for now
        }
    };


//        if (scanner != null) {
//            scanner.startScan(scanCallback);
////            Log.d(TAG, "scan started");
//            Toast.makeText(, "scan started", Toast.LENGTH_SHORT).show();
//        }  else {
////            Log.e(TAG, "could not get scanner object");
//            Toast.makeText(, "could not get scanner obj", Toast.LENGTH_SHORT).show();
//        }





}
