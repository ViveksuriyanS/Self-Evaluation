package com.day1;

public class Task2 {

	public static void main(String[] args) {
		int array[] = { 4, 6, 8, 3, 7, 1, 5 };
		int N = 45;
		findSum(array, N);
	}

	private static void findSum(int[] inArr, int sum) {
		inArr = Task3.quickSort(inArr, 0, inArr.length - 1);
		boolean matchFound = false;
		System.out.println();
		for (int i = 0; i < inArr.length; i++) {
			int j = i + 1;
			int k = inArr.length - 1;

			while (j < k && !matchFound) {
				if (inArr[i] + inArr[j] + inArr[k] == sum) {
					System.out.println(inArr[i] + " " + inArr[j] + " " + inArr[k]);
					matchFound = true;
					break;
				} else if (inArr[i] + inArr[j] + inArr[k] > sum) {
					k++;
				} else if (inArr[i] + inArr[j] + inArr[k] < sum) {
					j++;
				}
			}

		}
		if (!matchFound) {
			System.out.println("Cannot find a combination");
		}
	}

}
