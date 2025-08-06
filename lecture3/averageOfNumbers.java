package lecture3;

import java.util.Scanner;

public class averageOfNumbers {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведи колко числа искаш да се прочетат:");
		int countLoop = input.nextInt();
		double average = 0.0;
		for (int i = 0; i < countLoop; i++) {
			int numbers = input.nextInt();
			average += numbers;
		}
		System.out.println("Средната стойност е " + (average / countLoop));
		input.close();
	}
}
