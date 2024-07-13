// 12. Perimeter Of Square

// Write a program to find the perimeter of a square given its area.
//Examples :
//Input: Area = 36 square units
//Output: Perimeter = 24 units
//Explanation: Since the area of the square is 36 square units, so the side of square will be 6 units. Therefore, the perimeter of the square will be 4 * 6 = 24 units.

package com.chandrika;

import java.util.Scanner;

public class DSA_03_K12_Permeter_of_square
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        double area, side, perimeter;

        area = 16;

        // Calculate side length
        side = Math.sqrt(area);

        // Calculate perimeter
        perimeter = 4 * side;

        System.out.println("Perimeter: " + perimeter);
    }
}

