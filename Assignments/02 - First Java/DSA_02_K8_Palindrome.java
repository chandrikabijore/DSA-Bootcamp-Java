// 8. To find out whether the given String is Palindrome or not.

package com.chandrika;

import java.util.Scanner;

public class DSA_02_K8_Palindrome
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String inputString = sc.nextLine();

        int left = 0;                                        // Initialize pointers for start and end of the string
        int right = inputString.length() - 1;

        boolean isPalindrome = true;                         // Variable to store if the string is a palindrome

        while (left < right)                                 // Check characters from both ends
        {
            if (inputString.charAt(left) != inputString.charAt(right))
            {
                isPalindrome = false;                        // Not a palindrome
                break;
            }
            left++;
            right--;
        }

        if (isPalindrome)
        {
            System.out.println("The given string is a palindrome.");
        }
        else
        {
            System.out.println("The given string is not a palindrome.");
        }
    }
}

