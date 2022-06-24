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
        int randomNumber = rand.nextInt(upperbound); //Shows what the random number generated
        int guess;
        int count = 0;
        while (randomNumber != 0) {
            System.out.println("Guess the NUMBER 1-99: ");
            Integer guessedNumber = Integer.valueOf(input.nextLine());
            String name = input.nextLine();
            guessedNumber = count ++;
            if (randomNumber > guessedNumber) {
                System.out.println("Too Small");
            } else if (randomNumber < guessedNumber) {
                System.out.println("Too Big");
            }else {
                System.out.println("Correct Guess");
                break;
            }
            System.out.println("Number of guesses:"+count);
        }
    }
}
