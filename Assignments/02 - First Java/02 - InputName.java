// Q2 - Take name as input and print a greeting message for that particular name.

package com.chandrika;
import java.util.Scanner;

public class InputName
{
    public static void main(String[] args)
    {
        String name;
        System.out.println("Enter your name here : ");

        Scanner n = new Scanner(System.in);
        name = n.next();

        System.out.println("Hey Har Har Mahadev " + name + ":)");
    }
}
