// 13. Perimeter Of Rhombus
// Java program to calculate area and perimeter of a rhombus using diagonals

package com.chandrika;

class DSA_03_K13_Permeter_of_Rhombus
{
    static int rhombusAreaPeri(int d1, int d2)                        //  // calculate area and perimeter of a rhombus
    {
        int area, perimeter;
        area = (d1 * d2) / 2;
        perimeter = (int)(2 * Math.sqrt(Math.pow(d1, 2) + Math.pow(d2, 2)));

        System.out.println( "The area of rhombus with diagonals " + d1 + " and " + d2 + " is " + area + ".");

        System.out.println("The perimeter of rhombus with diagonals " +d1 + " and " + d2 + " is " + perimeter + ".");
        return 0;
    }

    public static void main (String[] args)
    {
        int d1 = 2, d2 = 4;
        rhombusAreaPeri(d1, d2);
    }
}
