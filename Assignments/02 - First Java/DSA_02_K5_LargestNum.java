// 5. Take 2 numbers as input and print the largest number.

package com.chandrika;

import java.util.Scanner;

public class DSA_02_K5_LargestNum
{
    public static void main(String[] args)
    {
        int num1, num2;
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter First number : ");
        num1 = sc.nextInt();

        System.out.printf("Enter second number : ");
        num2 = sc.nextInt();

        if (num1 > num2)
        {
            System.out.printf(num1 + " is Largest Number...!!");
        }
        else if (num1 < num2)
        {
            System.out.printf(num2 + " is Largest Number...!!");
        }
        else
        {
            System.out.printf("Both numbers are Equal");
        }
    }
}
