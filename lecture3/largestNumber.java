package lecture3;

public class largestNumber {

	public static void main(String[] args) {
		int[] arays = { 10, 40, 356, -100, 13, 18};
		int largestNumber = Integer.MIN_VALUE;
		for (int i : arays) {
			if(largestNumber < i) {
				largestNumber = i;
			}
		}
		System.out.println("Най-голямото число е: " + largestNumber);
	}
}
