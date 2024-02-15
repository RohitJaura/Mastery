package com.joda.mastery;

import android.content.Context;
import android.widget.Toast;

public class Joda {
    public static void simpleToast(Context context, String message) {
        Toast.makeText(context, message, Toast.LENGTH_SHORT).show();
    }
}
