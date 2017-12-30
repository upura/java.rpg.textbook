package exercise;

public class Exercise21 {
	public static void main(String[] args) {
		int[] sampleArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		for (int i = 0; i < 10; i++) {
			if (sampleArray[i] == 1) {
				System.out.println("一番目です");
			} else if (sampleArray[i] == 2) {
				System.out.println("二番目です");
			} else {
				System.out.println("三番目以降です");
			}
		}
	}
}