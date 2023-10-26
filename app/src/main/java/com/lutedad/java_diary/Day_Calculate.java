package com.lutedad.java_diary;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class Day_Calculate {
    static class date_cal {

        // 현재 날짜 구하기
        LocalDate now = LocalDate.now();

        // 포맷 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd");

        // 포맷 적용
        String formattedDate = now.format(formatter);

    }

    static class time_cal {

        // 현재 시간
        LocalTime now = LocalTime.now();

        // 포맷 정의
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm");

        // 포맷 적용
        String formattedTime = now.format(formatter);
    }

    public static String time = new time_cal().formattedTime;
    public static String date = new date_cal().formattedDate;

}
