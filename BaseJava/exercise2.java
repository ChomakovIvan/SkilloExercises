package BaseJava;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведи число за страна А:");
		int sideA = input.nextInt();
		System.out.println("Въведи число за страна B:");
		int sideB = input.nextInt();
		System.out.println("Въведи число за страна C:");
		int sideC = input.nextInt();
		input.close();
		int perimeter = sideA + sideB + sideC;
		System.out.println("Обиколката на триъгълник със страни " + sideA + "," + sideB + " и " + sideC + " е " + perimeter);
	}
}
