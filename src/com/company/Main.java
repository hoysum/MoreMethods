package com.company;

import java.util.Scanner;

//Add two numbers given by the user.
//Get 5 letters from the user, output them sorted (Hint: Use ArrayList and Collections.sort())
//Get the length of a string.
//Get the average of 3 numbers.
//Check if a year is a leap year (A leap year is divisible by 4).
//Count all words in the sentence: The dog jumped over the fence (use String.split(" ") method).
//Take two integer inputs from the user, compute its area.
//Print a 5 random numbers given a bound.
//Given the array list, print a random word from the list: (module, class, implement).
//Take integer input from the user, output whether it's odd or even.
//The letter grade is determined as follows:
//A = 90–100%
//B = 80–89%
//C = 70–79%
//D = 60–69%
//F = 0–59%
//Write a program that will print the letter grade based on the percentage entered.
public class Main {

    public static void main(String[] args) {
	// write your code here
        getNumbers();
    }

    public static void getNumbers(){
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter number 1");
        int num1 = keyboard.nextInt();

        System.out.println("Enter number 2");
        int num2 = keyboard.nextInt();


        int sum = AddTwoNumbers(num1,num2);
        System.out.println(sum);

    }

    public static int AddTwoNumbers(int num1, int num2){
        int sum=0;
        sum = num1 + num2;

        return sum;
    }
}
