package lecture2;

import java.util.Scanner;

public class days {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведи число от 1 до 7.");
		int number = input.nextInt();
		input.close();
		switch (number) {
		case 1: {
			System.out.println("Понеделник");
			break;
		}
		case 2: {
			System.out.println("Вторник");
			break;
		}
		case 3: {
			System.out.println("Сряда");
			break;
		}
		case 4: {
			System.out.println("Четвъртък");
			break;
		}
		case 5: {
			System.out.println("Петък");
			break;
		}
		case 6: {
			System.out.println("Събота");
			break;
		}
		case 7: {
			System.out.println("Неделя");
			break;
		}
		default:
			System.out.println("Въведено е грешно число.");
			break;
		}
	}
}
