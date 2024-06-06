//4. Take 2 numbers as inputs and find their HCF and LCM.
package com.chandrika;

import java.util.Scanner;

public class DSA_K4_LCM_HCF
{
    public static void main(String args[])
    {
        int num1, num2, temp, temp1, temp2, lcm, hcf;

        Scanner find = new Scanner(System.in);
        System.out.printf("Enter First number : ");         // 10
        num1 = find.nextInt();

        System.out.printf("Enter second number : ");        // 35
        num2 = find.nextInt();

        temp1 = num1;
        temp2 = num2;

        while (temp2 != 0)
        {
            temp = temp2;
            temp2 = temp1 % temp2;
            temp1 = temp;
        }

        hcf = temp1;
        lcm = (num1 * num2) / hcf;

        System.out.printf("The HCF of input numbers is : " + hcf);      // 5
        System.out.printf("The LCF of input numbers is : " + lcm);      // 70
    }
}
