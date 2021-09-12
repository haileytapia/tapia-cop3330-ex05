/*
 *  UCF COP3330 Fall 2021 Assignment 1 Solution
 *  Copyright 2021 Hailey Tapia
 */

package org.example;

import java.util.Scanner;

public class App
{
    public static void main(String[] args)
    {
        String firstNum, secondNum;
        Scanner input = new Scanner(System.in);

        int firstInt, secondInt;

        System.out.print("What is the first number? ");
        firstNum = input.nextLine();
        firstInt = Integer.parseInt(firstNum);

        System.out.print("What is the second number? ");
        secondNum = input.nextLine();
        secondInt = Integer.parseInt(secondNum);

        System.out.print(firstInt + " + " + secondInt + " = " +(firstInt + secondInt) + "\n" + firstInt + " - " + secondInt + " = " + (firstInt - secondInt) + "\n" + firstInt + " * " + secondInt + " = " + (firstInt * secondInt) + "\n" + firstInt + " / " + secondInt + " = " + (firstInt / secondInt));
    }
}