package BaseJava;

import java.util.Scanner;

public class exercise6 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведи минути:");
		int minutes = input.nextInt();
		input.close();
		int days = minutes / (24 * 60);
		int years = 0;
		if(days > 364) {
			years = days / 365;
			days -= years * 365;
		}
		System.out.println(minutes + " минути са " + years + " година/и и " + days + " дни." );	
	}
}
