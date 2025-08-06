package lecture3;

public class ReverseList {

	public static void main(String[] args) {
		int[] aray = { 10, 20, 30, 40, 50};
		String reverseList = "";
		for(int i = aray.length - 1; i >= 0; i--) {
			if(i > 0) {
				reverseList += aray[i] + ", ";
			} else {
				reverseList += aray[i];
			}
			
		}
		System.out.println(reverseList);
	}
}
