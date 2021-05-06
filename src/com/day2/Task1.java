package com.day2;

import java.util.HashMap;
import java.util.Map;

public class Task1 {

	public static void main(String[] args) {
		int[] Array = { 4, 6, 8, 3, 7, 1, 5, 3, 6 };

		Map<Integer, Integer> freqMap = new HashMap<Integer, Integer>();

		for (int val : Array) {
			freqMap.computeIfPresent(val, (k, v) -> v + 1);
			freqMap.putIfAbsent(val, 1);
		}
		System.out.println(freqMap.entrySet());
	}

}
