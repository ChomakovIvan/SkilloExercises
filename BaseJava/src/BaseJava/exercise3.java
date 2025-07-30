package BaseJava;

import java.util.Scanner;

public class exercise3 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int sideA = input.nextInt();
		int sideB = input.nextInt();
		input.close();
		double area = (sideA + sideB) / 2.0;
		System.out.println(area);
	}

}
