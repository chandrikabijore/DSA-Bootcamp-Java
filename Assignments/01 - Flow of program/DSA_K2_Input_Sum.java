//2. Take two numbers and print the sum of both.
package com.chandrika;

import java.util.Scanner;

public class DSA_K2_Input_Sum
{
    public static void main(String[] args)
    {
        int Num1, Num2, Sum;

        Scanner sum = new Scanner(System.in);
        System.out.printf("Enter first number Here : ");
        Num1 = sum.nextInt();

        System.out.printf("Enter second number Here : ");
        Num2 = sum.nextInt();

        Sum = Num1 + Num2;

        System.out.printf("The Sum of this two number is : " + Sum);
    }
}

