/* 
* Program name: creditCard.cpp
* Author: Caio Souza
* Date last updated: 10/23/2023
* Purpose: Create a program to check the validity of credit card numbers
*/

import java.util.Scanner;
import java.util.Vector;

public class creditCard 
{
    /** Return true if the card number is valid */
    public static boolean isValid(Vector v)
    {
        if ((sumOfDoubleEvenPlace(v) + sumOfOddPlace(v)) % 10 != 0)
            return false;

        return true;
    }

    /** Get the result from Step 2 */
    public static int sumOfDoubleEvenPlace(Vector v)
    {
        int sum = 0;
        for (int i=v.size()-2;i>=0;i-=2)
        {
            
            int temp = (int)v.get(i);//get # from vector
            temp = temp*2;//double it
            
            //check if it has two digits, if so add them together
            sum += getDigit(temp);
        }
        return sum;
    }

    /** Return this number if it is a single digit, otherwise,
     * return the sum of the two digits */
    public static int getDigit(int number)
    {
        if (number > 9)
        {
            String numToAdd = Integer.toString(number);
            number = (numToAdd.charAt(0) - '0') + numToAdd.charAt(1) - '0';
        }

        return number;
    }

    /** Return sum of odd-place digits in number */
    public static int sumOfOddPlace(Vector v)
    {
        int sum = 0;
        for (int i=v.size()-1;i>=0;i-=2)
        {
            sum += (int)v.get(i);
        }

        return sum;
    }

    /** Return true if the number d is a prefix for number */
    public static boolean prefixMatched(Vector v)
    {
        switch ((int)v.get(0))
        {
            case 4: return true;
            case 5: return true;
            case 6: return true;
            case 3:
                if ((int)v.get(1) == 7)
                    return true;
        }

        return false;
    }
    /** Return the number of digits in d */
    public static int getSize(long d)//didnt need this as I used vector
    {
        int x =0;

        return x;
    }
    /** Return the first k number of digits from number. If the
     * number of digits in number is less than k, return number. */
    public static long getPrefix(long number, int k)//didnt need this as I used vector
    {
        long x=0;

        return x;
    }

    public static void main(String[] args)
    {
        //declare scanner to get user input
        Scanner read = new Scanner(System.in);
        
        System.out.println("Enter a credit card number as a long integer:");
        String input = read.nextLine();
        read.close();

        //used for testing
        //String input = "4388576018410707";
        //String input = "4388576018402626";

        //declare int vector to manipulate input
        Vector<Integer> vec = new Vector<Integer>();

        for (int i=0;i<input.length();i++)
        {
            //parse through string and put each number in a vector
            // - '0' converts the ascii code for number to the numeric value of it
            vec.add((int)input.charAt(i) - '0');
        }

        //first check ( number must be 13-16 digits long) and prefix must match
        if (vec.size() < 13 || vec.size() > 16 || !prefixMatched(vec))
            System.out.println(input + " is invalid");
        
        else if (isValid(vec))
                System.out.println(input + " is valid");
            else
                System.out.println(input + " is invalid");
    }
            
    
}
