// 5. Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package com.chandrika;

import java.util.Scanner;

public class DSA_01_K5_SumUntilX
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        while (true)
        {
            System.out.print("Enter a number (or 'x' to stop): ");
            String input = scanner.next();

            if (input.equals("x"))
            {
                break;
            }

            if (isValidNumber(input))
            {
                int number = Integer.parseInt(input);
                sum += number;
            }
            else
            {
                System.out.println("Invalid input. Please enter a valid number or 'x' to stop.");
            }
        }

        System.out.println("Sum of all entered numbers: " + sum);
        scanner.close();
    }

    public static boolean isValidNumber(String input)
    {
        for (int i = 0; i < input.length(); i++)
        {
            if (!Character.isDigit(input.charAt(i)))
            {
                return false;
            }
        }
        return true;
    }
}

