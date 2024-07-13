// 8. Perimeter Of Circle
package com.chandrika;

public class DSA_03_K8_Perimeter_of_circle
{
    static final double PI = Math.PI;

    // Function to calculate the perimeter of the circle
    static double Perimeter(double r)
    {
        return 2 * PI * r;
    }

    public static void main(String[] args)
    {
        double r = 5;
        System.out.println("Perimeter of the circle is : " + Perimeter(r));
    }
}

