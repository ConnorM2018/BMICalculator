package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        //
        Scanner keyboard;
        keyboard = new Scanner(System.in);
        int feet;
        int inches;
        double m;
        int lb;
        double kg;
        double bmi;

        //
        System.out.println("Welcome to BMI Calculator. To continue, you must answer the following questions.");
        System.out.println("________________________________________________________________________________");
        //
        System.out.println("What is you height (only feet)?");
        feet = keyboard.nextInt();
        System.out.println("What is your height (only inches)?");
        inches = keyboard.nextInt();
        //
        inches = inches + (feet * 12);
        System.out.println("Your height in inches is "+inches+".");
        //
        m = (0.0254*inches);
        System.out.println("You are also "+m+" meters tall.");
        System.out.println("To the nearest whole number, what is your weight in pounds?");
        lb = keyboard.nextInt();
        //
        kg = (lb*0.453592);
        System.out.println("This means that your weight in Kilograms is "+kg+".");
        //
        bmi = (kg/(m*m));
        System.out.println("Your BMI is "+bmi+".");


    }
}
