// 1. Area Of Circle Java Program
package com.chandrika;

import java.util.Scanner;

public class DSA_03_K1_Area_Of_Circle
{
    public static void main(String[] args)
    {
        double area, PI = 3.14, r;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter radius of circle : ");
        r = sc.nextDouble();

        area = PI * r * r;

        System.out.println("Area of circle is : " + area);
    }
}
