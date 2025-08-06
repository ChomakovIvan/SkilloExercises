package lecture3;

import java.util.Scanner;

public class numbersDivisibleBy5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведи произволно число:");
		int number = input.nextInt();
		while(number % 5 != 0) {
			System.out.println("Въведи произволно число:");
			number = input.nextInt();
		}
		System.out.println("Числото " + number + " е кратно на 5.");
	}
}
