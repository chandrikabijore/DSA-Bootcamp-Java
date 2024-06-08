// 9. To find Armstrong Number between two given number.
package com.chandrika;
import java.util.Scanner;

public class DSA_02_K9_Armstrong
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower bound of the range: ");
        int lowerBound = sc.nextInt();
        System.out.print("\nEnter the upper bound of the range: ");
        int upperBound = sc.nextInt();

        System.out.println("\nArmstrong numbers between " + lowerBound + " and " + upperBound + " are:");

        boolean foundAny = false;

        for (int num = lowerBound; num <= upperBound; num++)        // Find and print Armstrong numbers in the range
        {
            int originalNumber = num;
            int sum = 0;
            int numberOfDigits = String.valueOf(num).length();

            while (originalNumber != 0)                     // Calculate the sum of digits raised to the power of the number of digits
            {
                int digit = originalNumber % 10;
                sum += Math.pow(digit, numberOfDigits);
                originalNumber /= 10;
            }

            if (sum == num)                                 // Check if the number is an Armstrong number
            {
                System.out.print(num + " ");
                foundAny = true;
            }
        }
        if (!foundAny)
        {
            System.out.println("\nNo Armstrong numbers found in the given range.");
        }
        sc.close();
    }
}

// Output: Enter the lower bound of the range: 100
//         Enter the upper bound of the range: 500
//
//Armstrong numbers between 100 and 500 are:
//153 370 371 407 
