
import java.util.Scanner;
public class switchCase {
    public static void main(String[] args) {
        System.out.println("Guess a number between 1 and 5");
        try (Scanner input = new Scanner(System.in)) {
            int guess = input.nextInt();
            switch (guess) {
                case 1:
                    System.out.println("You guessed 1");
                    break;
                case 2:
                    System.out.println("You guessed 2");
                    break;
                case 3:
                    System.out.println("You guessed 3");
                    break;
                case 4:
                    System.out.println("You guessed 4");
                    break;
                case 5:
                    System.out.println("You guessed 5");
                    break;
                default:
                    System.out.println("Guess a number between 1 and 5");
            }
        }
    }
}
