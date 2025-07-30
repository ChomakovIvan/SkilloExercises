package BaseJava;

import java.util.Scanner;

public class exercise2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sideA = input.nextInt();
		int sideB = input.nextInt();
		int sideC = input.nextInt();
		input.close();
		int perimeter = sideA + sideB + sideC;
		System.out.println(perimeter);
		

	}

}
