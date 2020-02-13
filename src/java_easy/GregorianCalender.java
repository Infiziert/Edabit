package java_easy;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Christmas Eve is almost upon us, so naturally we need to prepare some milk and cookies for Santa!
 * Create a method that accepts a GregorianCalendar object and returns true if it's Christmas Eve (December 24th) and false otherwise.
 */
public class GregorianCalender {

    public static void main(String[] args) {
        System.out.println(timeForMilkAndCookies(new GregorianCalendar(2013, 11, 24)));
        System.out.println(timeForMilkAndCookies(new GregorianCalendar(2013, 0, 23)));
        System.out.println(timeForMilkAndCookies(new GregorianCalendar(3000, 11, 24)));
    }

    /**
     * Dates are zero based (see resources).
     * All test cases contain valid dates.
     */
    public static boolean timeForMilkAndCookies(GregorianCalendar date) {
        final int dayNumber = date.get(Calendar.DAY_OF_MONTH);
        final int monthNumber = date.get(Calendar.MONTH);
        return dayNumber == 24 && monthNumber == 11;
    }

}
