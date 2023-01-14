package com.example.livpart2.dataPack

import android.Manifest.permission.ACTIVITY_RECOGNITION
import android.Manifest.permission_group.ACTIVITY_RECOGNITION
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.content.ContextCompat

/*
Implementation made following guide
https://developers.google.com/fit/android/authorization#android_permissions
 */
/*
fun permissiongrant(){
    if (ContextCompat.checkSelfPermission(thisActivity, Manifest.permission.ACTIVITY_RECOGNITION)
        != PackageManager.PERMISSION_GRANTED) {
        // Permission is not granted
    } else{
        ActivityCompat.requestPermissions(thisActivity,
            arrayOf(Manifest.permission.ACTIVITY_RECOGNITION),
            MY_PERMISSIONS_REQUEST_ACTIVITY_RECOGNITION)
    }
}
*/