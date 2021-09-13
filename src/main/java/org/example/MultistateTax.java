package org.example;

/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 David Bradford
 */
import java.util.Scanner;
public class MultistateTax
{

    public static void main( String[] args )
    {
        Scanner input = new Scanner(System.in);

        int oa;
        double tax = 0.0, total = 0.0;
        String state, county;

        System.out.print( "What is the order amount? " );
        oa = input.nextInt();
        System.out.print( "What state do you live in? " );
        state = input.next();

        if(state.equals("Wisconsin")){
            System.out.print( "What county do you live in? " );
            county = input.next();
            switch (county) {
                case "Eau Claire":
                    tax = (oa * .055);
                    total = (oa + tax);
                    break;
                case "Dunn":
                    tax = (oa * .054);
                    total = (oa + tax);
                    break;
                case "Dane":
                    tax = (oa * .05);
                    total = (oa + tax);
                    break;
                default:
                    System.out.println("Error county not in system");
                    break;
            }
        }
        else if(state.equals("Illinois")){
            tax = (oa*.08);
            total = (oa+tax);
            }
        else {
            tax= 0;
            total = oa;

            }

        System.out.println("The tax is $"+String.format("%.2f", tax)+"\n"+"The total is $"+String.format("%.2f", total)+".");

        }
}

