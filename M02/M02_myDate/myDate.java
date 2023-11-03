/*
 * Program name: myDate.java Author: Caio Souza Date last updated: 10/28/2023 Purpose: define a date
 * class using gregorian calendar
 */

import java.util.GregorianCalendar;

public class myDate {

    public String[] strMonths = {"January", "February", "March", "April", "May", "June", "July",
            "August", "September", "October", "November", "December"};

    private int year;
    private String month;
    private int day;

    // defaul constr.
    public myDate() {
        // declare and initialize a GregorianCalendar obj to retrieve current date data
        GregorianCalendar currentDate = new GregorianCalendar();
        year = currentDate.get(GregorianCalendar.YEAR);

        // since month is 0-based, no need to decrement
        month = strMonths[currentDate.get(GregorianCalendar.MONTH)];
        day = currentDate.get(GregorianCalendar.DAY_OF_MONTH);
    }

    public myDate(long elapsedTime) {
        // use setter to do the work here
        this.setDate(elapsedTime);
    }

    // param. constr.
    public myDate(int y, int m, int d) {
        year = y;
        month = strMonths[--m];
        day = d;
    }

    // Getters
    public int getYear() {
        return year;
    }

    public String getMonth() {
        return month;
    }

    public int getDay() {
        return day;
    }

    // Setter
    public void setDate(long elapsedTime) {
        GregorianCalendar eT = new GregorianCalendar();
        eT.setTimeInMillis(elapsedTime);

        year = eT.get(GregorianCalendar.YEAR);
        month = strMonths[eT.get(GregorianCalendar.MONTH) - 1];
        day = eT.get(GregorianCalendar.DAY_OF_MONTH);
    }

    // gets a day as a param and formats output to be printed
    public static String getSuffix(int day) {
        String suffix;

        switch (day) {
            case 1:
                suffix = "st";
                break;
            case 2:
                suffix = "nd";
                break;
            case 3:
                suffix = "rd";
                break;
            default:
                suffix = "th";
        }
        return suffix;
    }

    public static void main(String[] args) {

        long eT1 = 561555550000L;
        long eT2 = 34355555133101L;
        myDate d1 = new myDate();// current date
        myDate d2 = new myDate(eT2);// assignment required date
        myDate d3 = new myDate(eT1);// assignment test date
        myDate d4 = new myDate(2023, 10, 23);// day classes started

        System.out.println("Date #1: " + d1.getMonth() + " " + d1.getDay() + getSuffix(d1.getDay())
                + ", " + d1.getYear() + " -> current date, using default constr.");
        System.out.println("Date #2: " + d2.getMonth() + " " + d2.getDay() + getSuffix(d2.getDay())
                + ", " + d2.getYear() + " assignment required date, using myDate(long)");
        System.out.println("Date #3: " + d3.getMonth() + " " + d3.getDay() + getSuffix(d3.getDay())
                + ", " + d3.getYear()
                + " assignment test date, output: 9/18/1987, using myDate(long)");
        System.out.println("Date #4: " + d4.getMonth() + " " + d4.getDay() + getSuffix(d4.getDay())
                + ", " + d4.getYear() + " day class started, using myDate(int, int, int)");

    }
}

/*
 * @startuml !theme crt-amber skinparam classAttributeIconSize 0
 * 
 * class myDate { {field} -year : int -month : int -day : int
 * 
 * {method} +myDate() +myDate(elapsedTime : long) +myDate(year : int, month : int, day : int)
 * 
 * +getYear() : int +getMonth() : int +getDay() : int
 * 
 * +setDate(elapsedTime : long) : void }
 * 
 * @enduml
 */
