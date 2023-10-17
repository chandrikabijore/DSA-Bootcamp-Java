// Q3 - Write a program to input principal, time, and rate (P, T, R) from the user and find Simple Interest.
package com.chandrika;

import java.util.Scanner;

public class SimpleInterest
{
    public static void main(String[] args)
    {
        float p, t, r, SimpleInterest;
        Scanner SI = new Scanner(System.in);

        System.out.println("Enter principal : ");
        p = SI.nextFloat();
        System.out.println("Enter time : ");
        t = SI.nextFloat();
        System.out.println("Enter rate : ");
        r = SI.nextFloat();

        SimpleInterest = p * r * t;
        System.out.println("Simple Interest is " + SimpleInterest);
    }
}
