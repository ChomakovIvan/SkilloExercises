package lecture2;

import java.util.Scanner;

public class leapYear {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведи година");
		int year = input.nextInt();
		input.close();
		if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
			System.out.println("Високосна година");
		} else {
			System.out.println("Не е високосна година");
		}
	}
}
