package com.chandrika;
import java.util.Scanner;

public class LeapYearTwo
{
    public static void main(String[] args)
    {
        int Year;
        System.out.println("Enter  any  calendar year :");
        Scanner Y = new Scanner(System.in);
        Year = Y.nextInt();

        if (Year != 0)
        {
            if (Year % 400 == 0)
            {
                System.out.println(Year+" is a leap year");
            }
            else if (Year % 100 != 0)
            {
                if (Year %4 == 0 )
                {
                    System.out.println(Year+" is a leap year");
                }
                else
                {
                    System.out.println(Year+" is not a leap year");
                }
            }
            else
            {
                System.out.println(Year + " is not a leap year");
            }
        }
        else
        {
            System.out.println("Year zero does not exist ");
        }
    }
}
