// 14. Volume Of Cone Java Program
// Java Program to Find the Surface Area and Volume of a Cone
package com.chandrika;

public class DSA_03_K14_Volume_of_Cone
{
    public static void main(String[] args)
    {
        double R = 6, H = 8;                                           // specify radius and height of cone

        double S = Math.sqrt(R * R + H * H);                           // calculate slant height S

        double SurfaceArea = (Math.PI * R * R) + (Math.PI * R * S);    // calculate surface area of cone

        double Volume = (Math.PI * R * R * H) / 3;                     // calculate volume of cone

        System.out.println("Surface area of cone is : " + SurfaceArea);

        System.out.println("Volume of cone is : " + Volume);
    }
}
