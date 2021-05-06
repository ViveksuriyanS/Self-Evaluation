package com.task;

import java.io.IOException;
import java.util.ArrayList;

public class C {
	public float m(float x, float y) throws IOException {
		return 0;
	}
	public static void main(String[] args) {
		ArrayList<Integer> ia = new ArrayList<Integer>();
		ia.add(1);
		ia.add(2);
		ia.add(-9);
		ia.add(3);
		ia.add(-1);
		ia.add(-1);
		int i = 0;
		while(i < ia.size()) {
			if(ia.get(i) < 0) {
				ia.remove(i);
			} else {
				i++;
			}
		}
		System.out.println(ia);
	}
}

class D extends C {
	@Override
	public float m(float x, float y){
		return 0;
	}
}