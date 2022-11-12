package algorithm;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MinimumGap {
	
	public static int minimumGap(List<Integer> arr) {
		int minGap = arr.size() - 1;
		int gap = 0;
		for (int i = 0; i < arr.size(); i++) {
			for (int j = 0; j < arr.size(); j++) {
				if (arr.get(i) == arr.get(j) & i != j) {
					gap = Math.abs(j - i);
				}
				if (minGap > gap & gap != 0) {
					minGap = gap;
				}
			}
		}
		if (gap == 0) {
			minGap = gap;
		}
		return minGap;
	}
	
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>(Arrays.asList(2, 3, 5, 7, 6, 5, 4));
		int minGap = minimumGap(list);
		System.out.println("The mininum gap: " + minGap);
	}
}
