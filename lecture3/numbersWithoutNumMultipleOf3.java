package lecture3;

import java.util.Scanner;

public class numbersWithoutNumMultipleOf3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведи число:");
		int number = input.nextInt();
		while(true) {
			if(number % 3 == 0) {
				number = input.nextInt();
				continue;
			}
			System.out.println(number);
			number = input.nextInt();
		}
	}
}
