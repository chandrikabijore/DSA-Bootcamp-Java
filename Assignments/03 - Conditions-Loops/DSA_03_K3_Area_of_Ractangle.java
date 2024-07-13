//3. Area Of Rectangle Program
package com.chandrika;

import java.util.Scanner;

public class DSA_03_K3_Area_of_Ractangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Length of rectangle : ");   //5
        int Length = sc.nextInt();

        System.out.println("Enter Width of rectangle : ");   //6
        int Width = sc.nextInt();

        System.out.println("Area of Rectangle is : " + AreaRectangle(Length, Width));     //30
        System.out.println("Perimeter of Rectangle is : " + PeriMeterRectangle(Length, Width));     //22
    }

    public static int AreaRectangle(int Length, int Width)
    {
        int Area = Length * Width;
        return Area;
    }

    public static int PeriMeterRectangle(int Length, int Width)
    {
        int Perimeter = 2 * (Length + Width);
        return Perimeter;
    }
}
