package com.example.attendance;

import android.bluetooth.BluetoothAdapter;
import android.bluetooth.le.BluetoothLeScanner;
import android.bluetooth.le.ScanCallback;
import android.bluetooth.le.ScanFilter;
import android.bluetooth.le.ScanResult;
import android.bluetooth.le.ScanSettings;
import android.content.Intent;
import android.os.Build;
import android.os.Handler;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

import java.util.List;


public class MainActivity3 extends AppCompatActivity {

    @RequiresApi(api = Build.VERSION_CODES.M)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);


        BluetoothAdapter bluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
        BluetoothLeScanner bluetoothLeScanner;
        ScanSettings settings;

        List<ScanFilter> filters = null;


        if(bluetoothAdapter == null || !bluetoothAdapter.isEnabled()){
            Intent enableBTIntent = new Intent(BluetoothAdapter.ACTION_REQUEST_ENABLE);
            startActivityForResult(enableBTIntent, 1);
        }else{
            bluetoothLeScanner = bluetoothAdapter.getBluetoothLeScanner();
            settings = new ScanSettings.Builder()
                    .setScanMode(ScanSettings.SCAN_MODE_LOW_LATENCY)
                    .setCallbackType(ScanSettings.CALLBACK_TYPE_ALL_MATCHES)
                    .build();

//            scanLeDevice(true);
        }

        boolean scanning;
        Handler handler = new Handler();

        // Stops scanning after 10 seconds.
        final long SCAN_PERIOD = 10000;


//        public void scanLeDevice(){
//            if (!scanning) {
//                // Stops scanning after a predefined scan period.
//                handler.postDelayed(new Runnable() {
//                    @Override
//                    public void run() {
//                        scanning = false;
//                        bluetoothLeScanner.stopScan(leScanCallback);
//                    }
//                }, SCAN_PERIOD);
//
//                scanning = true;
//                bluetoothLeScanner.startScan(leScanCallback);
//            } else {
//                scanning = false;
//                bluetoothLeScanner.stopScan(leScanCallback);
//            }
//        }


//        public void scanLeDevice(boolean enable){
//            if(enable){
//                handler.postDelayed(()->{
//                    if(LeDeviceListAdapter.isEmpty() && scanning){
//                        Toast.makeText(MainActivity3.this, "", Toast.LENGTH_SHORT).show();
//                    }
//                    scanning = false;
//                    if(bluetoothAdapter.isEnabled()){
//                        bluetoothLeScanner.stopScan(leScanCallback);
//                        invalidateOptionsMenu();
//                    }
//                },SCAN_PERIOD);
//
//                scanning = true;
//                bluetoothLeScanner.startScan(filters, settings, leScanCallback);
//            }else{
//                scanning = false;
//                if(bluetoothAdapter.isEnabled()){
//                    bluetoothLeScanner.stopScan(leScanCallback);
//                }
//            }
//            invalidateOptionsMenu();
//        }
        // Device scan callback.

    }

//    private void scanLeDevice(boolean b) {
//    }
//
//
//    LeDeviceListAdapter leDeviceListAdapter = new LeDeviceListAdapter();
//
//    ScanCallback leScanCallback = new ScanCallback() {
//        @Override
//        public void onScanResult(int callbackType, ScanResult result) {
//            super.onScanResult(callbackType, result);
//            leDeviceListAdapter.addDevice(result.getDevice());
//            leDeviceListAdapter.notifyDataSetChanged();
//        }
//    };
}