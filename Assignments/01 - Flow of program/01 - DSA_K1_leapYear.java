//1. Input a year and find whether it is a leap year or not.
package com.chandrika;

import java.util.Scanner;

public class DSA_K1_leapYear
{
    public static void main(String[] args)
    {
        Scanner leap = new Scanner(System.in);
        System.out.printf("Enter Leap year : ");
        int year = leap.nextInt();

        if (isLeapYear(year))
        {
            System.out.printf(year + " is a Leap year.");
        }
        else
        {
            System.out.printf(year + " is not a Leap year.");
        }
    }

    public static boolean isLeapYear(int year)
    {
        if (year % 4 == 0)
        {
            if (year % 100 == 0)
            {
                if (year % 400 == 0)
                {
                    return true;
                }
                else
                {
                    return false;
                }
            }
            else
            {
                return true;
            }
        }
        else
        {
            return false;
        }
    }
}

