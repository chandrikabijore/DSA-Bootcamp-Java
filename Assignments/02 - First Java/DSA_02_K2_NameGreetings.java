// 2. Take name as input and print a greeting message for that particular name.
package com.chandrika;

import java.util.Scanner;

public class DSA_02_K2_NameGreetings
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter your name please : ");
        String name = sc.next();

        sc.close();

        System.out.printf("Good Morning :) Have a great day...!!! " + name);
    }
}

