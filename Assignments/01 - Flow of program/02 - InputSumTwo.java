// Q2.Take two numbers and print the sum of both.

package com.chandrika;
import java.util.Scanner;

public class InputSumTwo
{
    public static void main(String[] args) {
        int N1, N2, Sum;
        
        System.out.println("Enter the value of N1 : ");
        Scanner n1 = new Scanner(System.in);
        N1 = n1.nextInt();

        System.out.println("Enter the value of N1 : ");
        Scanner n2 = new Scanner(System.in);
        N2 = n2.nextInt();
        
        Sum = N1 + N2;
        
        System.out.println("Sum of this number is : " +Sum);
    }
} 
