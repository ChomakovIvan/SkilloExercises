package lecture2;

import java.util.Scanner;

public class workAge {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведи твоята възраст");
		int age = input.nextInt();
		input.close();
		if (age >= 16) {
			System.out.println("Отговяраш на условието за работа.");
		} else {
			System.out.println("Не отговяраш на условието за работа.");
		}
	}
}
