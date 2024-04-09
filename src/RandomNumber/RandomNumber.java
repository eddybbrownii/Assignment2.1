package RandomNumber;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

	public static void main(String[] args) {

//		int numberofLoops=5;
//		for (int i = 0; i < numberofLoops; i++);
//			
		Random random = new Random();
		int randomNumber = random.nextInt(100) + 1;
		int tryCount = 0;
		
		//System.out.println(You Lose!);
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pick a number between 0 and 100");

		boolean guessedCorrectly = false;

		while (!guessedCorrectly) {
			int guess = scanner.nextInt();
			tryCount++;
			if (guess == randomNumber) {
				guessedCorrectly = true;
				System.out.println("You Win!");
			} else if (tryCount > 4) {
			System.out.println("You lose. The number was " + randomNumber);
				
			} else if (guess < randomNumber) {
				System.out.println("Please pick a higher number");
			} else {
				System.out.println("Please pick a lower number.");
			}
		}
		scanner.close();
	}
}
