// 3.Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package com.chandrika;

import java.util.Scanner;

public class DSA_02_K3_SimpleInterest_P_T_R
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter the principal amount : " );        // 1000
        double Principal = sc.nextDouble();

        System.out.printf("Enter the time period : ");              // 5
        double Time = sc.nextDouble();

        System.out.printf("Enter the Rate : ");                     // 10
        double Rate = sc.nextDouble();

        double SimpleInterest = (Principal * Time * Rate ) / 100;

        System.out.printf("Simple Interest is " + SimpleInterest);         // 500.0
    }
}
