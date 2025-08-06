package lecture2;

import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Въведи число за ъгъл А:");
		int angleA = scan.nextInt();
		System.out.println("Въведи число за ъгъл В:");
		int angleB = scan.nextInt();
		System.out.println("Въведи число за ъгъл С:");
		int angleC = scan.nextInt();
		scan.close();
		boolean isTriangle = angleA + angleB + angleC == 180;
		if (isTriangle) {
			System.out.println("Триъгълника може да се построи");
			if(angleA == 90 || angleB == 90 || angleC == 90) {
				System.out.println("Той ще е правоъгълен");
			} else if (angleA == 60 && angleB == 60 && angleC == 60){
				System.out.println("Той ще е равностранен");
			} else if (angleA == angleB || angleB == angleC || angleC == angleA){
				System.out.println("Той ще е равнобедрен");
			} else if (angleA < 90 && angleB < 90 && angleC < 90){
				System.out.println("Той ще е остроъгълен");
			} else if (angleA > 90 || angleB > 90 || angleC > 90){
				System.out.println("Той ще е тъпоъгълен/разностранен");
			} 
			
		} else {
			System.out.println("Не може да се създаде триъгълник.");
		}
	}
}
