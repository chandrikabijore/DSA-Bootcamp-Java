// 3. Take a number as input and print the multiplication table for it.
package com.chandrika;

import java.util.Scanner;

public class DSA_K3_Multiplication_Table
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.printf("Enter here any number : ");
        n = sc.nextInt();

        for (int i = 1; i <= 10; i++)
        {
            System.out.printf(n + " X " + i + " = " + (n * i) + "\n");
        }
    }
}



