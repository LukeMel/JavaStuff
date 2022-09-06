import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;

public class sortNumbersInList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 5 numbers");
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < 5; i++) {
            list.add(input.nextInt());
        }
        Collections.sort(list);
        System.out.println("The numbers in ascending order are: ");
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
    }
}
