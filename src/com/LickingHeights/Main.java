package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //Here, I am declaring my variables.
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int feet; // For the system to do any math, the variables for feet & inches must be "int"
        int inches;
        double m; //The only way for the system to use decimals is by using "double"
        int lb;
        double kg;
        double bmi;

        //This is the code for what shows up when the person starts the calculator
        System.out.println("Welcome to BMI Calculator. To continue, you must answer the following questions.");
        System.out.println("________________________________________________________________________________");

        //These questions are for determining the height of the person.
        System.out.println("What is you height (only feet)?");
        feet = keyboard.nextInt(); // nextLine() is for Strings. For the system to process numbers, it must be nextInt().
        System.out.println("What is your height (only inches)?");
        inches = keyboard.nextInt();

        //This converts the feet to inches.
        inches = inches + (feet * 12);
        System.out.println("Your height in inches is "+inches+".");

        //This converts the inches to meters.
        m = (0.0254*inches);
        System.out.println("You are also "+m+" meters tall.");
        System.out.println("To the nearest whole number, what is your weight in pounds?");
        lb = keyboard.nextInt();

        //This converts the pounds to Kilograms.
        kg = (lb*0.453592);
        System.out.println("This means that your weight in Kilograms is "+kg+".");

        //This code does the equation for BMI.
        bmi = (kg/(m*m));
        System.out.println("Your BMI is "+bmi+".");
        //Of course, the line of code above tells the user their BMI.


    }
}
