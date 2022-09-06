
//create game with two players who need to guess a number between 1 and 10
import java.util.Scanner;
import java.util.Random;

public class GuessNumbers2Player {
    public static void main(String[] args) {
        System.out.println("Player 1, enter your name");
        try (Scanner input = new Scanner(System.in)) {
            String player1 = input.nextLine();
            System.out.println("Player 2, enter your name");
            String player2 = input.nextLine();
            System.out.println("Generating a random number between 1 and 10");
            for (int i = 0; i < 4; i++) {
                System.out.println(".");
            }
            Random rand = new Random();
            int number = rand.nextInt(10) + 1;

            for (int i = 3; i != 0; i--) {
                System.out.println(player1 + ", guess a number between 1 and 10");
                int guess1 = input.nextInt();
                System.out.println(player2 + ", guess a number between 1 and 10");
                int guess2 = input.nextInt();

                if (guess1 == number) {
                    System.out.println(player1 + " wins!");
                    return;
                } else if (guess2 == number) {
                    System.out.println(player2 + " wins!");
                    return;
                } else {
                    System.out.println("No one wins!");
                    System.out.println("You have " + i + " guesses left");

                }
            }
        }
    }
}
