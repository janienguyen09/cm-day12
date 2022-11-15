package algorithm;

public class SquareInteger {
	public static void main(String[] args) {
		System.out.println("Square integer: " + findSquareInteger(17, 24));

	}

	public static int findSquareInteger(int a, int b) {
		int count = 0;
		for (int i = 0; i <= (int) Math.sqrt(b); i++) {
			if (i * i <= b && i * i >= a) {
				count++;
			}
		}
		return count;
	}
}
