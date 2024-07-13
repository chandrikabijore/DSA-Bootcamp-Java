// 2. Area Of Triangle
package com.chandrika;

import java.util.Scanner;

public class DSA_03_K2_Area_of_Triangle 
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the length of side a: ");       //5
        double a = sc.nextDouble();

        System.out.print("Enter the length of side b: ");       //6
        double b = sc.nextDouble();

        System.out.print("Enter the length of side c: ");       //7
        double c = sc.nextDouble();

        // Calculate the semi-perimeter
        double s = (a + b + c) / 2;

        // Calculate the area using Heron's formula
        double area = Math.sqrt(s * (s - a) * (s - b) * (s - c));

        // Display the result
        System.out.println("The area of the triangle is: " + area);    // 14.696938456699069
    }
}
