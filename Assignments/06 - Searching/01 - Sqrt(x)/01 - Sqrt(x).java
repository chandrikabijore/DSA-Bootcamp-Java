// 69. Sqrt(x)
//Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
//
//You must not use any built-in exponent function or operator.
//
//For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
//Example 1:
//Input: x = 4
//Output: 2
//Explanation: The square root of 4 is 2, so we return 2.

package com.chandrika;

import java.util.Scanner;

public class DSA_06_K1_Searching_L_sqrt
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number you want square of : ");
        int x = sc.nextInt();

        System.out.println("The square root of " + x + " is " + mySqrt(x));
    }

    public static int mySqrt(int x)
    {
        if (x == 0 || x == 1)                 // If x is 0 or 1, the method returns x directly because the square root of 0 is 0, and the square root of 1 is 1.
            return x;

        int start = 1;                        // Initialize the search range for the square root.
        int end = x;
        int mid = -1;

        while (start <= end)                  // Perform binary search to find the square root of x.
        {
            mid = start + (end - start) / 2;  // Calculate the middle point using "start + (end - start) / 2" to avoid integer overflow.

            if ((long) mid * mid > (long) x)  // If the square of the middle value is greater than x, move the "end" to the left (mid - 1).
                end = mid - 1;
            else if (mid * mid == x)          // If the square of the middle value is equal to x, we found the square root.
                return mid;
            else                              // If the square of the middle value is less than x, move the "start" to the right (mid + 1).
                start = mid + 1;
        }
        return (end);                         // The loop ends when "start" becomes greater than "end", and "end" is the integer value of the square root.
    }                                         // However, since we might have been using integer division in the calculations,
}                                             // we round down the value of "end" to the nearest integer to get the correct square root.



// The reason for using (long) in the expression (long) mid * mid > (long) x is to prevent integer overflow during the
// multiplication of mid * mid. Here's a more detailed explanation
// If mid is 46341, then mid * mid = 46341 * 46341 = 2147488281, which exceeds the maximum value an int can hold.
}
