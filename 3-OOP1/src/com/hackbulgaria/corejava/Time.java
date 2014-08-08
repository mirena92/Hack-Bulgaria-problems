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
    
    public Time(int hour, int min, int sec, int day, int month, int year)
    {
        this.hour = hour;
        this.min = min;
        this.sec = sec;
        this.day = day;
        this.month = month;
        this.year = year;
    }
    
    @Override
    public String toString()
    {        
        String sb = String.format("%d:%d:%d %d.%d.%d", hour, min, sec, day, month, year);

        return sb;
    }
    
    public String now()
    {
        Calendar currentTime = Calendar.getInstance();
        currentTime.getTime();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss dd.MM.YYYY");
        
        return sdf.format(currentTime.getTime());
    }
    
    
    public static void main(String[] args) {
        
        long start = System.currentTimeMillis();       
        String str = null;
        for (int i = 0; i<10000; i++)
            str += "asdfghj";
        long finish = System.currentTimeMillis();
        
        long start2 = System.currentTimeMillis();       
        StringBuilder strB = new StringBuilder();
        for (int i = 0; i<10000; i++)
            strB.append("asdfghj");
        long finish2 = System.currentTimeMillis();
        
        System.out.println(finish-start);
        System.out.println(finish2-start2);      
    }
}

