package lecture2;

import java.util.Scanner;

public class celsiiFarenheit {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Въведи температура");
		double gradusi = input.nextInt();
		System.out.println("В каква мерна единица да се преобразува температурата");
		String edinica = input.next();
		input.close();
		double result = 0.0;
		if(edinica.equals("Celsius")) {
			result = (gradusi - 32) / 1.8;
			System.out.println(gradusi + " F = " + result + " C");
		} else if(edinica.equals("Fahrenheit")) {
			result = gradusi * 1.8 + 32;
			System.out.println(gradusi + " C = " + result + " F");
		}
	}
}
