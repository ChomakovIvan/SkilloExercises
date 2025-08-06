package BaseJava;

import java.util.Scanner;

public class exercise5 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведи число за страна А:");
		int sideA = input.nextInt();
		System.out.println("Въведи число за страна В:");
		int sideB = input.nextInt();
		System.out.println("Въведи число за страна C:");
		int sideC = input.nextInt();
		input.close();
		double area = (sideA + sideB) / 2.0;
		System.out.println("Лицето на триъгълник е " + area);
		int perimeter = sideA + sideB + sideC;
		System.out.println("Обиколката на триъгълник e " + perimeter);
	}
}
