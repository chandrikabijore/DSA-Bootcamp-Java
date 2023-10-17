// Q4 - Take 2 numbers as inputs and find their HCF and LCM.

package com.chandrika;
import java.util.Scanner;
public class HCF_LCM
{
    public static void main(String[] args)
    {
        int a, b, temp, temp1, temp2, hcf, lcm;
        Scanner A = new Scanner(System.in);

        System.out.print("First number : ");
        a = A.nextInt();

        System.out.print("Second number : ");
        b = A.nextInt();

        // for HCF
        temp1 = a;
        temp2 = b;

        while (temp2 != 0)
        {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }
        hcf = temp1;

        // for LCM
        lcm = (a * b) / hcf;

        System.out.println("HCF is : " +hcf);
        System.out.println("LCM is : " +lcm);
    }
}
