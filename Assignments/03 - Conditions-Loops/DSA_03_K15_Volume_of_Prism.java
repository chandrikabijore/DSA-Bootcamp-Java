// 15. Volume Of Prism

// Program to find the Volume of a Triangular Prism
//Last Updated : 09 Jun, 2022
//Given the length, width, and height of a triangular prism, the task is to find the volume of the triangular prism.
//Examples:  
//Input:  l = 18, b = 12, h = 9
//Output: Volume of triangular prism: 972

package com.chandrika;

public class DSA_03_K15_Volume_of_Prism
{
    static float findVolume(float l, float b, float h)
    {
        float volume = (l * b * h) / 2;          //  formula to find Volume
        return volume;
    }
    // Driver code
    public static void main(String[] args)
    {
        float l = 18, b = 12, h = 9;

        System.out.println("Volume of triangular prism: " + findVolume(l, b, h));     // function calling
    }
}
