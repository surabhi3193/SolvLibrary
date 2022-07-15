package com.example.solv;

import android.content.Context;
import android.widget.Toast;

public class ToasterClass {
    public static void showMessage(Context c, String message){

        Toast.makeText(c,message, Toast.LENGTH_SHORT).show();

    }
}
