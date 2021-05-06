package com.day1;

import java.util.Arrays;

public class Task3 {

	public static void main(String[] args) {
		int array[] = { 4, 6, 8, 3, 7, 1, 5 };
		quickSort(array, 0, array.length - 1);
	}

	public static int[] quickSort(int[] inputArr, int startIndex, int endIndex) {
		if (startIndex < endIndex) {
			int partitionIndex = partition(inputArr, startIndex, endIndex);
			System.out.println(partitionIndex);
			quickSort(inputArr, startIndex, partitionIndex - 1);
			quickSort(inputArr, partitionIndex + 1, endIndex);
		}
		return inputArr;
	}

	private static int partition(int[] inputArr, int start, int end) {
		int pivotIndex = 0;
		int pivotValue = inputArr[end];
		for (int i = 0; i < end; i++) {
			if (inputArr[i] < pivotValue) {
				int tmp = inputArr[i];
				inputArr[i] = inputArr[pivotIndex];
				inputArr[pivotIndex] = tmp;
				pivotIndex++;
			}
		}
		inputArr[end] = inputArr[pivotIndex];
		inputArr[pivotIndex] = pivotValue;
		System.out.println(Arrays.toString(inputArr));
		return pivotIndex;
	}

}
