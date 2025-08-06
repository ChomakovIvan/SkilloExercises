package lecture2;

import java.util.Scanner;

public class holiday {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведи вид почивка");
		String typeHoliday = input.next();
		System.out.println("Въведи бюджет");
		int budjet = input.nextInt();
		input.close();
		if(typeHoliday.equals("Beach")) {
			if(budjet < 50) {
				System.out.println("Ще почиваш в България");
			} else {
				System.out.println("Ще почиваш в чужбина");
			}
		} else if(typeHoliday.equals("Mountain")) {
			if(budjet < 30) {
				System.out.println("Ще почиваш в България");
			} else {
				System.out.println("Ще почиваш в чужбина");
			}
		} else {
			System.out.println("Няма информация за този тип почивка");
		}
	}
}
