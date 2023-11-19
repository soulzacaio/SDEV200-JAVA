/* 
* Program name: conversion.java
* Author: Caio Souza
* Date last updated: 10/23/2023
* Purpose: Create a program to convert between feet and meters.
*/
public class conversion
{
    // silly function, im just playing with this
    public static void nextLine()
    {
        System.out.println("\n");
    }

    // foot to meter
    public static double footToMeter(double foot)
    {
        return 0.305 * foot;
    }

    // meter to foot
    public static double meterToFoot(double meter)
    {
        return 3.279 * meter;
    }

    public static void main(String[] args)
    {
        // print table header in appropriate format
        System.out.println("Feet\t\tMeters\t\t|\tMeters\t\tFeet");

        // loop over to print a separator from header/data
        for (int i = 0; i < 65; i++)
            System.out.print("-");// used print to avoid the \n char
        nextLine();

        // initialize an int to be used as meter data, for foot data the iterator 'i' is
        // used
        int meters = 20;

        // loop over 10 times
        for (int i = 1; i < 11; i++)
        {
            // this line prints a full row using String.format() to account for decimal
            // places
            System.out.println(String.format("%.1f", (double) i) + "\t\t" + String.format("%.3f", footToMeter(i))
                    + "\t\t|\t" + String.format("%.1f", (double) meters) + "\t\t"
                    + String.format("%.3f", meterToFoot(meters)));

            // increment meters for next iteration
            meters += 5;

        }

    }
}
