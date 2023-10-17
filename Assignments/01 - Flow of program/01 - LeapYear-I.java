# // Q1 - Input a year and find whether it is a leap year or not.

package com.chandrika;
import java.util.Scanner;

public class LeapYearOne
{
    public static void main(String[] args)
    {
        int year;
        System.out.println("Enter a year here : ");
        Scanner Y = new Scanner(System.in);
        year = Y.nextInt();

        if (year%100==0 && year%400==0 || year%100!=0 && year%4==0)
        {
            System.out.println("Entered year is leap year.");
        }
        else
        {
            System.out.println("Entered year is not leap year.");
        }
    }
}
