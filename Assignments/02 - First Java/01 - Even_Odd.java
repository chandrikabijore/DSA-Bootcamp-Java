// Q1 - Write a program to print whether a number is even or odd, also take input from the user.
package com.chandrika;
import java.util.Scanner;

public class Even_Odd {
    public static void main(String[] args){
        int EO;
        System.out.println("Enter any number : ");
        
        Scanner eo = new Scanner(System.in);
        EO = eo.nextInt();

        if(EO % 2 == 0) {
            System.out.println("This is Even number.");
        }
        else {
            System.out.println("This is odd number.");
        }
    }
} 
