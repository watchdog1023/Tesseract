package com.titantech.watchdog1023.tesseract.tools;

import android.app.Activity;
import android.app.Fragment;
import android.content.Context;

public interface RequestPermissionsTool {
    void requestPermissions(Activity context, String[] permissions);

    boolean isPermissionsGranted(Context context, String[] permissions);

    void onPermissionDenied();
}
