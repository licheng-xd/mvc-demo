package com.lchml.demo.utils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeUtil {

    private static final SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public static String getNow() {
        return ft.format(new Date());
    }
}
