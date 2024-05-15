package com.lchml.demo.utils;

public class StringUtil {

    public static boolean notEquals(String a, String b) {
        if (a == null || b == null) {
            return false;
        } else {
            return !a.equals(b);
        }
    }

    public static boolean lengthCheck(String src, int min, int max) {
        return src != null && src.length() >= min && src.length() <= max;
    }

    public static boolean isEmpty(String src) {
        return src == null || src.length() == 0;
    }
}
