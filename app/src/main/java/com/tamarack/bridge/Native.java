package com.tamarack.bridge;

public class Native {
    static {
        System.loadLibrary("tamarack");
    }

    public static native void runProc();
}
