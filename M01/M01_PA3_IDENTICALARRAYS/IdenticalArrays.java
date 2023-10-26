/* 
* Program name: identicalArrays.cpp
* Author: Caio Souza
* Date last updated: 10/23/2023
* Purpose: Create a program that takes two 2d arrays of data and compares if arrays are equal
*/

import java.util.Scanner;


public class IdenticalArrays 
{
    public static boolean equals(int[][] m1, int[][]m2)
    {
        boolean found;//flag to control the search
    
        for (int j=0;j<3;j++)
            for (int k=0;k<3;k++)//j&k loops set up to try each element of m1
            {
                found = false;//reset it to false after each search

                //x&y loops, here each m1 element is compared against all m2 elems
                for (int x=0;x<3;x++)
                {
                    for (int y=0;y<3;y++)
                        if (m1[j][k] == m2[x][y] && m1[j][k] > 0)//if match found
                        {
                            found = true;//update flag and break out
                            m1[j][k] = m2[x][y] = -1;
                            //the line above prevents that duplicate numbers interfere with the search
                            break;
                        }
                    
                    if(found)//break out again as match for m1 elem was found
                        break;

                }
                if (!found)//if after iterating over m2, no match is found, they are not equals. return
                    return false;
            }
            
        return true;
    }

    public static void main(String[] args)
    {
        //declaring and initializing 2 2d arrays
        int[][] m1 = new int[3][3];
        int[][] m2 = new int[3][3];
        
        Scanner read = new Scanner(System.in);

        //prompt user for data
        System.out.println("Enter list1:");
        String strInput = read.nextLine();
        
        //split numbers in input using whitespace as reference
        String[] numbers = strInput.split(" ");
        
        //iterate over m1, populating it with converted contents of numbers
        int i = 0;
        for (int j=0;j<3;j++)
            for (int k=0;k<3;k++)
                m1[j][k] = Integer.valueOf(numbers[i++]);
                

        //same process for m2
        System.out.println("Enter list2:");
        strInput = read.nextLine();
        read.close();
 
        numbers = strInput.split(" ");

        i = 0;
        for (int j=0;j<3;j++)
            for (int k=0;k<3;k++)
                m2[j][k] = Integer.valueOf(numbers[i++]);


        if (equals(m1, m2))
            System.out.println("The two arrays are identical");
        else
            System.out.println("The two arrays are not identical");

            //debugging
                for (int j=0;j<3;j++)
            for (int k=0;k<3;k++)
                System.out.println(m1[j][k] + " --- " + m2[j][k]);
    }

}
