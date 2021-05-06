package com.day1;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

	public static void main(String[] args) {
		int array[] = { 4, 6, 8, 3, 7, 1, 5 };
		int N = 15;
		findSum(array, N);
	}

	private static void findSum(int[] inArr, int sum) {
		Map<Integer, Integer> testedResult = new HashMap<Integer, Integer>();
		for (int i : inArr) {
			testedResult.putIfAbsent(Math.abs(sum - i), i);
			if (testedResult.get(i) != null) {
				System.out.println(i + " " + testedResult.get(i));
				break;
			}
		}
	}
}
