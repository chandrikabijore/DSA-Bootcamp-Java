// 4. Area Of Isosceles Triangle
package com.chandrika;

import java.util.Scanner;

public class DSA_03_K4_Area_of_Isosceles_Triangle
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Length of Isosceles Triangle : ");     //5
        int Length = sc.nextInt();

        System.out.println("Enter the Base of Isosceles Triangle : ");      //8
        int Base = sc.nextInt();

        double IsoscelesArea =  (Length * Base)/2;  // 0.5 ( Length * BAse) // Same means h inka

        System.out.println("Area of Isosceles Triangle is : " + IsoscelesArea);   //20

    }
}
