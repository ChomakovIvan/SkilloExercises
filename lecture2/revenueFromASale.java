package lecture2;

import java.util.Scanner;

public class revenueFromASale {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведи единична цена");
		double singlePrice = input.nextDouble();
		System.out.println("Въведи количество");
		int quantity = input.nextInt();
		input.close();
		double discount = 0.0;
		double salesRevenue = singlePrice * quantity;
		if(quantity >= 100 && quantity <= 120) {
			discount = salesRevenue * 0.15;
			salesRevenue -= discount;
		} else if(quantity > 120) {
			discount = salesRevenue * 0.2;
			salesRevenue -= discount;
		}
		System.out.println("Приходите от продажбата: " + salesRevenue + " $");
		System.out.println("Отстъпка: " + discount + " $");
	}
}
