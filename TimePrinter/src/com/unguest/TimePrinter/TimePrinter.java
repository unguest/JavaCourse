package com.unguest.TimePrinter;

public class TimePrinter {

    private static final String INVALID_INPUT_MESSAGE = "Invalid Value";

    public static String getDurationString(int minutes, int seconds) {

        if (minutes >= 0 && (seconds >=0 && seconds <= 59 )) {
            int hours = minutes / 60;
            minutes = minutes % 60;
            return hours + "h " + minutes + "m " + seconds + "s";
        }

        return INVALID_INPUT_MESSAGE;
    } // getDurationString(int, int)

    public static String getDurationString(int seconds) {
        return getDurationString(seconds / 60, seconds % 60);
    } // getDurationString(int)

} // TimePrinter Class
