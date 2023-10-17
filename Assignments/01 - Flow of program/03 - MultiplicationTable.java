// Q3- Take a number as input and print the multiplication table for it.

package com.chandrika;
import java.util.Scanner;

public class MultiplicationTable
{
    public static void main(String[] args)
    {
        int n, i;
        System.out.println("Enter number : ");
        Scanner T = new Scanner(System.in);
        n = T.nextInt();

        for (i = 1; i <= 10; ++i)
        {
            System.out.printf("%d * %d = %d\n", n, i, n * i);
        }
    }
}
