//11. Perimeter Of Rectangle
package com.chandrika;

import java.util.Scanner;

public class DSA_03_K11_Perimeter_of_Ractangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of rectangle : ");   //5
        int Length = sc.nextInt();

        System.out.println("Enter Width of rectangle : ");   //6
        int Width = sc.nextInt();

        System.out.println("Perimeter of Rectangle is : " + PeriMeterRectangle(Length, Width));     //22
    } 

    public static int PeriMeterRectangle(int Length, int Width)
    {
        int Perimeter = 2 * (Length + Width);
        return Perimeter;
    }

}
