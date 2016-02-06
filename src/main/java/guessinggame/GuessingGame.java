package guessinggame;

/**
 * Created by katie on 1/14/16.
 */

import java.util.Scanner;
import java.util.Random;
public class GuessingGame {
    static int tries = 0;

    public static void main(String[] args) {
        Random rand = new Random();
        int secret = rand.nextInt(10) + 1;
        boolean correct = false;
        int lastGuess = 0;
        while (!correct) {
            Scanner in = new Scanner(System.in);
            System.out.println("Guess the secret number 1 to 10.");
            int newGuess = in.nextInt();
            if (lastGuess == newGuess) {
                System.out.println("You already guessed that.");
            }
            else if (newGuess == secret) {
                tries++;
                System.out.println("Good job!");
                if (tries == 1) {
                    System.out.println("First try!");
                } else {
                    System.out.println(tries + " tries!");
                }
                correct = true;
            } else {
                if (newGuess > secret) {
                    tries++;
                    System.out.println("Your number was too high.");
                    lastGuess = newGuess;
                } else {
                    tries++;
                    System.out.println("Your number was too low.");
                    lastGuess = newGuess;
                }
            }
        }

    }
}
