// 9. Perimeter Of Equilateral Triangle
package com.chandrika;

public class DSA_03_K9_Perimeter_of_Equilateral_Triangle
{
    // Function to calculate Perimeter of equilateral triangle
    static float peri_equi_triangle(float side)
    {
        return 3 * side;         // formula
    }

    // Driver Code
    public static void main(String arg[])
    {
        float side = 4;
        System.out.print("Perimeter of Equilateral Triangle : ");
        System.out.println(peri_equi_triangle(side));
    }
}
