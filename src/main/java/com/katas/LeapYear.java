package com.katas;

public class LeapYear {


    private int year;

    public LeapYear(int year)
    {
        this.year = year;
    }


    public boolean valid_leap_year(int year) {

        boolean return_value;


        if(year % 4 != 0 && year % 100 != 0 && year % 400 != 0 ){
            return_value = false;
        }else {
            return_value = true;
        }

        return return_value;
    }


}
