package lecture3;

public class numberMultipleOf5 {

	public static void main(String[] args) {
		int[] aray = { 12, 15, 32, 42, 55, 75, 122, 132, 150, 180, 200};
		for (int i : aray) {
			if(i > 150) {
				System.out.println("Числото " + i + " е по-голямо от 150.");
				break;
			}
			if(i % 5 == 0) {
				System.out.println("Числото " + i + " се дели на 5.");
			}
		}
	}
}
