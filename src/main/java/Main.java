/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();//instance of random class
        int upperbound = 99;//Generates values 0-99
        int randomNumber = rand.nextInt(upperbound);//Shows what the random number generated
        int guessedCounter = 0;
        int count = 0;

        while (randomNumber != 0) {
            System.out.println("Guess a NUMBER 1-99: ");
            int guessedNumber = input.nextInt();
            guessedCounter = count++;

            if (guessedNumber < randomNumber) {
                System.out.println("Too Small");
            }else if (guessedNumber > randomNumber) {
                System.out.println("Too Big");
            }else {
                System.out.println("Correct Guess");
                break;
            }
            System.out.println("Number of guesses:"+count);
        }
    }
}
