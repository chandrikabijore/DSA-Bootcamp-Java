//7. Area Of Equilateral Triangle
package com.chandrika;

import java.util.Scanner;

public class DSA_03_K7_Area_of_Equilateral_Triangle
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the side length of the equilateral triangle
        System.out.print("Enter the side length of the equilateral triangle: ");   // 5
        double side = scanner.nextDouble();

        // Calculate the area of the equilateral triangle
        double area = (Math.sqrt(3) / 4) * side * side;

        // Display the result
        System.out.println("The area of the equilateral triangle is: " + area);  //  10.825317547305486

        scanner.close();
    }
}
