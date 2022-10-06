package io.checknft.api.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Date {
    public static String format(String date) {
        final String oldDateFormat = "yyyy-MM-dd HH:mm:ss";
        final String newDateFormat = "yyyy-MM-dd'T'HH:mm:ss.SSS'Z'";
        SimpleDateFormat sdf = new SimpleDateFormat(oldDateFormat);
        java.util.Date newDate = null;
        try {
            newDate = sdf.parse(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        sdf.applyPattern(newDateFormat);
        return sdf.format(newDate);
    }
}