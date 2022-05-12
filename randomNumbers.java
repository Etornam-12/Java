package com.etornam;
import java.util.Random;
import java.util.Scanner;

public class randomNumbers {
    public static void main(String[] args) {

        System.out.println("Let's play a Guessing Game");

        Random random = new Random();

//set the boundary for your Random to 7.
        int x = random.nextInt(6)+1;

//Declare Variables to make user the values
        Scanner scanner = new Scanner(System.in);
        System.out.println("Guess the number between 0 to 6");
        int Value = scanner.nextInt();

//State your conditions for which the number will be Correct or wrong
        if (Value == x)
        System.out.println("You are right");
                else
        System.out.println("You lost. \nThe number is "+ x);

    }
}
