//7. To calculate Fibonacci Series up to n numbers.

package com.chandrika;

import java.util.Scanner;

public class DSA_02_K7_Fibonacci
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of terms for Fibonacci series: ");
        int n = sc.nextInt();

        int firstTerm = 0;                    // Variables to store the first two terms of the Fibonacci series
        int secondTerm = 1;

        System.out.print("Fibonacci Series up to " + n + " terms: ");

        for (int i = 1; i <= n; i++)
        {
            System.out.print(firstTerm + " ");
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}

