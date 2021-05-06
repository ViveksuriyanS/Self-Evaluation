package com.day2;

public class Task3 {

	public static void main(String[] args) {
		QueueX queue = new QueueX(5);
		queue.enQueueX(1);
		queue.enQueueX(2);
		queue.enQueueX(3);
		queue.enQueueX(4);
		queue.enQueueX(5);
		queue.printQueueX();
		System.out.println(queue.deQueueX());
		System.out.println(queue.deQueueX());
		queue.enQueueX(6);

	}

}

class QueueX {
	int head, tail = -1;
	int[] QueueXArr;

	public QueueX(int size) {
		QueueXArr = new int[size];
	}

	public void enQueueX(int data) {
		if (tail < QueueXArr.length) {
			QueueXArr[++tail] = data;
			if (head == -1) {
				head++;
			}
			System.out.println(head + " " + tail);
		} else
			System.out.println("Cannot enQueueX");
	}

	public int deQueueX() {
		System.out.println(head + " " + tail);
		if (tail < head) {
			System.out.println("Cannot DeQueueX");
		}
		return QueueXArr[head++];
	}

	public void printQueueX() {
		for (int i = head; i <= tail; i++) {
			System.out.println(QueueXArr[i]);
		}
	}

	public boolean isEmpty() {
		if (head == -1) {
			return true;
		} else {
			return false;
		}
	}
}