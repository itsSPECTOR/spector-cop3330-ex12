package org.example;
import java.util.Scanner;

/**
 *
 * UCF COP3330 Fall 2021 Assignment 12 Solution
 * Copyright 2021 Reese Spector
 *
 */

public class App
{

    public static void main( String[] args )
    {
        // scanner
        Scanner input = new Scanner(System.in);

        // get info
        System.out.print("Enter the principal: ");
        String strPrin = input.nextLine();
        System.out.print("Enter the rate of interest: ");
        String strInt = input.nextLine();
        System.out.print("Enter the number of years: ");
        String strYrs = input.nextLine();

        //convert strings
        double numPrincipal = Double.parseDouble(strPrin);
        double numInt = Double.parseDouble(strInt) / 100;
        double numYrs = Double.parseDouble(strYrs);

        //math
        double total = numPrincipal * (1 + (numYrs * numInt));
        total = Math.round(total * 100);
        total = total/100;

        //print summary
        System.out.print("After " + Math.round(numYrs) + " years at " +  (numInt * 100) + "%, the investment will be worth $" + Math.round(total));

    }
}
