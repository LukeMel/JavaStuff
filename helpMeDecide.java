import java.util.Scanner;
import java.util.Random;

public class helpMeDecide {
    public static void main(String[] args) {
        System.out.println("Enter a list of items separated by commas");
        try (Scanner input = new Scanner(System.in)) {
            String items = input.nextLine();
            String[] itemsArray = items.split(",");
            Random rand = new Random();
            int number = rand.nextInt(itemsArray.length);            
            System.out.println("You should choose: " + itemsArray[number]);
        }
    }
    
}
