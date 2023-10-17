// Q5 - Keep taking numbers as inputs till the user enters ‘x’, after that print sum of all.
package com.chandrika;
import java.util.Scanner;
public class KeepTakingNumber
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter numbers (type 'x' to calculate the sum):");
        while (true)
        {
            String input = sc.nextLine();

            if (input.equalsIgnoreCase("x"))
            {
                break;
            }
            try
            {
                int number = Integer.parseInt(input);
                sum += number;
            }
            catch (NumberFormatException e)
            {
                System.out.println("Invalid input. Please enter a number or 'x' to calculate the sum.");
            }
        }
        System.out.println("The sum of all entered numbers is: " + sum);
        sc.close();
    }
}
