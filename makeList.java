//using the Terminal create programm that will ask user to fill a list with numbers and then print the list to the console
import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;
public class makeList {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many Items do you want to enter?");
        int size = input.nextInt();
        int[] list = new int[size];
        System.out.println("Enter the Items: ");
        for (int i = 0; i < list.length; i++) {
            list[i] = input.next();
        }
        System.out.println("The list is: ");
        for (int i = 0; i < list.length; i++) {
            System.out.print(list[i] + " ");
        }
    }
}
