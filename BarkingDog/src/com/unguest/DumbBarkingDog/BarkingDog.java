package com.unguest.DumbBarkingDog;

public class BarkingDog {

    public static boolean shouldWakeUp(boolean isBarking, int hour) {
        return isBarking && ((hour >= 0 && hour < 8) || (hour == 23));
    } // shouldWakeUp()

} // BarkingDog Class
