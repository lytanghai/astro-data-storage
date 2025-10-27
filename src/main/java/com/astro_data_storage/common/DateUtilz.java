package com.astro_data_storage.common;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class DateUtilz {
    public static final String DATE_FORMAT_1 = "yyyy-MM-dd";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

    public static String format(Date date) {
        return format(date, DATE_FORMAT_1);
    }

    public static String format(Date date, String format) {
        return format(date, format, null);
    }

    public static String format(Date date, String format, String defaultValue) {
        return date == null ? defaultValue : new SimpleDateFormat(format).format(date);
    }

    public static LocalDateTime parse(String str) {
        return LocalDateTime.parse(str, formatter);
    }


}
