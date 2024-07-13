// 6. Area Of Rhombus
package com.chandrika;

import java.util.Scanner;

public class DSA_03_K6_Area_of_Rhombus
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the length of the first diagonal (d1): ");
        double d1 = scanner.nextDouble();

        System.out.print("Enter the length of the second diagonal (d2): ");
        double d2 = scanner.nextDouble();

        // Calculate the area of the rhombus
        double area = 0.5 * d1 * d2;

        System.out.println("The area of the rhombus is: " + area);

        scanner.close();
    }
}
