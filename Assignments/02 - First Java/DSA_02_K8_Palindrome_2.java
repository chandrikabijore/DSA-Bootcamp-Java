package com.chandrika;

import java.util.Scanner;

public class DSA_02_K8_Palindrome_2
{
    public static void main(String[] args)
    {
        int n, r, c, s = 0;

        Scanner sc = new Scanner(System.in);
        System.out.printf("Enter a number : ");
        n = sc.nextInt();

        c = n;

        while (n > 0)
        {
            r = n % 10;
            s = (s * 10) + r;
            n = n /10;
        }

        if (c == s)
        {
            System.out.printf("Palindrome Number...!!!");
        }
        else
        {
            System.out.printf("Not a Palindrome Number...!!!");
        }
    }
}

