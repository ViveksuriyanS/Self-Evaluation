package com.day1;

import java.util.Arrays;

public class Task4 {

	public static void main(String[] args) {
		StackX stack = new StackX(10);
		System.out.println(stack.isEmpty());
		stack.push(5);
		stack.push(6);
		stack.push(7);
		stack.push(8);
		stack.push(9);
		System.out.println(stack.isEmpty());
		System.out.println(stack.pop());
		stack.printStack();
	}

}

class StackX {

	static int top = -1;
	static int[] arr;

	public StackX(int size) {
		arr = new int[size];
	}

	public void push(int data) {
		arr[++top] = data;
	}

	public int peek() {
		return arr[top];
	}

	public int pop() {
		return arr[top--];
	}

	public boolean isEmpty() {
		return top > -1 ? false : true;
	}

	public void printStack() {
		System.out.println(Arrays.toString(Arrays.copyOfRange(arr, 0, top + 1)));
	}
}