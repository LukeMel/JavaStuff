//using the Terminal create a program that will roll a dice
//ask the user how many sides the dice should have
//repeat the process until the user enters 0 to exit the game
import java.util.Random;
import java.util.Scanner;

public class RollingDiceAdvanced {
    public static void main(String[] args) {
        int sides = 6;
        try (Scanner input = new Scanner(System.in)) {
            while (sides != 0) {
            System.out.println("How many sides does the dice have?");
            sides = input.nextInt();
            
            if (sides == 0) {
                System.out.println("Goodbye");
                System.exit(0);
            }
            Random rand = new Random();
            int result = rand.nextInt(sides) + 1;
            System.out.println("You rolled a: " + result);
            }
        }
    }
}