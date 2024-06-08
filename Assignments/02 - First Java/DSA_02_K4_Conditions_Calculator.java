// 4. Take in two numbers and an operator (+, -, *, /) and calculate the value. (Use if conditions)

package com.chandrika;

import java.util.Scanner;

public class DSA_02_K4_Conditions_Calculator
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter first number : ");
        int num1 = sc.nextInt();

        System.out.printf("Enter second number : ");
        int num2 = sc.nextInt();

        System.out.printf("Enter any Operator (+, -, *, /) : ");
        char Operator = sc.next().charAt(0);

        int Result = 0;
        boolean ValidOperation = true;

        switch (Operator)
        {
            case '+':
                Result = num1 + num2;
                break;

            case '-':
                Result = num1 - num2;
                break;

            case '*':
                Result = num1 * num2;
                break;

            case '/':
                if (num2 != 0)
                {
                    Result = num1 / num2;
                }
                else
                {
                    System.out.println("Error: Division by zero is not allowed.");
                    ValidOperation = false;
                }
            default:
                System.out.printf("You have Entered Invalid Operator...");
        }

        System.out.printf("The Result is : " + Result);
    }
}

