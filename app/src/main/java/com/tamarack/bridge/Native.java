package com.tamarack.bridge;

public class Native {
    static {
        System.loadLibrary("unnamed");
    }

    public static native String stringFromJNI();
}
