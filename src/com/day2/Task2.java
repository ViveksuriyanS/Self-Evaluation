package com.day2;

import java.util.Arrays;

public class Task2 {

	public static void main(String[] args) {
		int array[] = { 4, 6, 8, 3, 7, 1, 5, 2 };
		bubbleSort(array);
	}

	public static void bubbleSort(int[] arrays) {
		for (int i = 0; i < arrays.length; i++) {
			for (int j = i; j < arrays.length; j++) {
				if (arrays[i] > arrays[j]) {
					int tmp = arrays[j];
					arrays[j] = arrays[i];
					arrays[i] = tmp;
				}
			}
		}
		System.out.println(Arrays.toString(arrays));
	}
}
