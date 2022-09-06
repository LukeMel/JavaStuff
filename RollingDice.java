
import java.util.Random;
public class RollingDice {

	public static void main(String[] args) {
		
				//  with math.random
		//  int max = 6;
		//  int min = 1;
		//  int range = max - min + 1;
		//  int result = (int)(Math.random() * range) + min;

				 //  with utilRandom
		Random rand = new Random();
		int result = rand.nextInt(6) + 1;
		System.out.println("You rolled a: " + result);
	}

}
