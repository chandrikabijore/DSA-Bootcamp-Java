package com.chandrika;

import java.util.Scanner;

public class DSA_02_K9_Armstrong_2
{
    public static void main(String[] args)
    {
        int n, rem, c, arm = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        n = sc.nextInt();

        c = n;

        while (n > 0)
        {
            rem = n % 10;
            arm = (rem * rem * rem) + arm;
            n = n / 10;
        }

        if (c == arm)
        {
            System.out.println("Entered Number is armstrong number...!!!");
        }
        else
        {
            System.out.println("Entered Number is not armstrong number...!!!");
        }


    }
}
