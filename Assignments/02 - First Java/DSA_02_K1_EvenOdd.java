// 1. Write a program to print whether a number is even or odd, also take input from the user.

package com.chandrika;

import java.util.Scanner;

public class DSA_02_K1_EvenOdd
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to check even or odd : ");
        int n = sc.nextInt();

        sc.close(); // Closing the scanner to prevent resource leak

        if (n % 2 == 0)
        {
            System.out.printf("Given number is Even..!!");
        }
        else
        {
            System.out.printf("Given number is Odd..!!");
        }

    }
}
