package lecture3;

import java.util.Scanner;

public class guessTheNumber {

	public static void main(String[] args) {
		int number = 13;
		Scanner scan = new Scanner(System.in);
		System.out.println("Познай числото: ");
		int guess = scan.nextInt();
		while(guess != number) {
			if(guess < number) {
				System.out.println("Числото е по-голямо");
			} else {
				System.out.println("Числото е по-малко");
			}
			System.out.println("Опитай пак: ");
			guess = scan.nextInt();
		}
		System.out.println("Позна числото.");
	}
}
