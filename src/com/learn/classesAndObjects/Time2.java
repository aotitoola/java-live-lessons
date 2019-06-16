package com.learn.classesAndObjects;

public class Time2 {

    private int hour; // 0 -23
    private int minute; // 0 - 59
    private int second; // 0 - 59

    // Time2 no-argument constructor:
    // initializes each instance variable to zero

    public Time2(){
        this(0, 0, 0); //invoke constructor with 3 arguments
    }

    // Time2 constructor: hour supplied, minute and second defaulted to 0
    public Time2(int hour){
        this(hour, 0, 0);   // invoke constructor with 3 arguments
    }

    // Time2 constructor: hour, minute and second supplied
    public Time2(int hour, int minute)
    {
        this(hour, minute, 0); // invoke constructor with 3 arguments
    }

    // Time2 constructor: hour, minute and second supplied
    public Time2(int hour, int minute, int second)
    {
        if (hour < 0 || hour >= 24)
            throw new IllegalArgumentException("Hour must be 0 - 23");

        if (minute < 0 || minute >= 60)
            throw  new IllegalArgumentException("Minute must be 0 - 59");

        if (second < 0 || second >= 60)
            throw new IllegalArgumentException("Second must be 0 - 59");

        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }


    // Time2 constructor: another Time2 object supplied
    public Time2(Time2 time)
    {
        this(time.getHour(), time.getMinute(), time.getSecond());
    }

    // Set Methods
    // set a new time value using universal time;
    private int getHour(){
        return this.hour;
    }

    private int getMinute(){
        return this.minute;
    }

    private int getSecond(){
        return this.second;
    }

    // convert to String in universal-time format (HH:MM:SS)
    public String toUniversalString()
    {
        return String.format("%02d:%02d:%02d", getHour(), getMinute(), getSecond());
    }

    // convert to String in standard-time format (H:MM:SS AM or PM)
    public String toString()
    {
        return String.format("%02d:%02d:%02d", (getHour() == 0 || getHour() == 12) ? 12 : getHour() % 12,
                getMinute(), getSecond(), (getHour() < 12 ? "AM" : "PM"));
    }
}   // end class Time2
