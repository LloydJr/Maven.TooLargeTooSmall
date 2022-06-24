/**
 * Created by iyasuwatts on 10/17/17.
 */

import java.util.Scanner;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Guess the NUMBER: ");
        Integer y = Integer.valueOf(input.nextLine());
        Random rand = new Random();//instance of random class
        int upperbound = 9;//Generates values 0-9
        int x = rand.nextInt(upperbound); //Shows what the random number generated
        System.out.println("The random number: " + x);
        if (x > y) {
            System.out.println("Too Small");
        }
        else if (x == y) {
            System.out.println("Correct Guess");
        }
        else if (x < y) {
                System.out.println("Too Big");
                }
    }
    }
