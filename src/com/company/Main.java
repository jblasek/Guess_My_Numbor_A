package com.company;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int randomNumber = (int )(Math.random() * 100 + 1);
        System.out.println("Try to guess the number");




        while(true){

            int guessingNumber = 0;
            Scanner keyboard = new Scanner(System.in);
            guessingNumber = keyboard.nextInt();



            if (guessingNumber == randomNumber) {
                System.out.println("You guessed the number!");
                System.exit(0);
            }
            else if (guessingNumber > randomNumber) {
                System.out.println("The number is lower than your guess!");
            }
            else {
                System.out.println("The number is higher than your guess!");
            }
        }
    }
}

