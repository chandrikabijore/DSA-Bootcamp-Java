// 6. Input currency in rupees and output in USD.
package com.chandrika;

import java.util.Scanner;

public class DSA_02_K6_Currency_Rupees_To_USD
{
    public static void main(String[] args)                                      // 1USD=83.33INR
    {
        double conversionRate = 0.012;                                          //  Define the conversion rate from INR to USD

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount in INR: ");  //5000                  // Input the amount in INR
        double amountInINR = sc.nextDouble();

        double amountInUSD = amountInINR * conversionRate;                      // Convert the amount to USD

        System.out.printf("The amount in USD is: %.2f%n", amountInUSD); //60   // Display the amount in USD

        sc.close();
    }
}

