package com.hackbulgaria.corejava;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Time {

    private int day;
    private int month;
    private int year;

    private int hour;
    private int min;
    private int sec;

    public Time(int hour, int min, int sec, int day, int month, int year) {
        if (hour < 0 || hour > 23) {
            throw new IllegalArgumentException("Invalid hour! Please enter hour of 00 to 23");
        } else
            this.hour = hour;

        if (min < 0 || min > 60) {
            throw new IllegalArgumentException("Invalid minute! Please enter minute of 00 to 60");
        } else
            this.min = min;

        if (sec < 0 || sec > 60) {
            throw new IllegalArgumentException("Invalid sec! Please enter second of 00 to 60");
        } else
            this.sec = sec;

        if (day < 0 || day > 30) {
            throw new IllegalArgumentException("Invalid day! Please enter day of 00 to 30");
        } else
            this.day = day;

        if (month < 0 || month > 12) {
            throw new IllegalArgumentException("Invalid month! Please enter month of 00 to 12");
        } else
            this.month = month;

        if (year < 0) {
            throw new IllegalArgumentException("Invalid year! Please enter positive number");
        } else
            this.year = year;
    }

    @Override
    public String toString() {

        String sb = String.format("%d:%d:%d %d.%d.%d", hour, min, sec, day, month, year);

        return sb;
    }

    public String now() {
        Calendar currentTime = Calendar.getInstance();
        currentTime.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd.MM.YYYY");

        return sdf.format(currentTime.getTime());
    }

    public static void main(String[] args) {
        Time x = new Time(21, 45, 51, 12, 06, -2014);
        x.toString();
    }
}

