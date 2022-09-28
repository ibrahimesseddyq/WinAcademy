package util;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class Date {
    public static String getDate(int day ,int month,int year){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy");
        Calendar cal = Date.setDate(day,month,year);
        return sdf.format(cal.getTime());
    }
    public static Calendar setDate(int day,int month,int year){
        Calendar calendar = Calendar.getInstance();

        calendar.set(day,month,year);

        return calendar;
    }



}
