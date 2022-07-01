package com.example.dispenseprocessingcompiler.utils;

class StringUtils {

    private StringUtils() { /* cannot be instantiated */ }

    public static boolean isEmpty(CharSequence str) {
        return str == null || str.length() == 0;
    }
}
