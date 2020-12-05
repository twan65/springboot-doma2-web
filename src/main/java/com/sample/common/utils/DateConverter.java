package com.sample.common.utils;

import org.thymeleaf.util.StringUtils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

/**
 * 日付関連のコンバーター
 */
public class DateConverter {

    private static String FORMAT_JAPAN_DATE = "yyyy年MM月dd日";

    /**
     * 文字列の日付「yyyy年MM月dd日」をLocalDateに変換
     * @param value 文字列の日付「yyyy年MM月dd日」
     * @return LocalDate
     */
    public static LocalDate convertStringToLocalDate(String value) {
        if (StringUtils.isEmpty(value)) {
            return null;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_JAPAN_DATE);
        return LocalDate.parse(value, formatter);
    }

    /**
     * LocalDateを文字列の日付「yyyy年MM月dd日」に変換
     * @param date LocalDate
     * @return 文字列の日付「yyyy年MM月dd日」
     */
    public static String convertLocalDateToString(LocalDate date) {
        if (Objects.isNull(date)) {
            return null;
        }

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(FORMAT_JAPAN_DATE);
        return date.format(formatter);
    }
}
