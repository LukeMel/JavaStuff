import java.util.Scanner;
import java.util.ArrayList;
import java.util.Random;
public class helpMeDecide2 {
    public static void main(String[] args) {
        System.out.println("Enter a list of items separated by commas");
        try (Scanner input = new Scanner(System.in)) {
            String items = input.nextLine();
            String[] itemsArray = items.split(",");
            ArrayList<String> itemsList = new ArrayList<String>();
            for (int i = 0; i < itemsArray.length; i++) {
                itemsList.add(itemsArray[i]);
            }
            Random rand = new Random();
            int number = rand.nextInt(itemsList.size());            
            System.out.println("You should choose: " + itemsList.get(number));
        }
    }    
}
