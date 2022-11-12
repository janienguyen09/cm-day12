package algorithm;

public class TheFeast {
	public static void main(String[] args) {
		int money = 6;
		int cost = 2;
		int numberOfWrappers = 2;
		System.out.println(chocolateFeast(money, cost, numberOfWrappers));
	}

	public static int chocolateFeast(int money, int cost, int numberOfWrappers) {
		int numberOfBarsEaten = money / cost;
		int wrappers = numberOfBarsEaten;

		while (wrappers >= numberOfWrappers) {
			int numberOfBars = wrappers / numberOfWrappers;
			numberOfBarsEaten += numberOfBars;
			wrappers = (wrappers % numberOfWrappers) + numberOfBars;
		}

		return numberOfBarsEaten;
	}
}
