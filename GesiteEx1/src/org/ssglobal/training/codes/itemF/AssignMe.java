package org.ssglobal.training.codes.itemF;

public class AssignMe {
	public static void main(String[] args) {
		int x = 3;
		int y = x * 2;
		
		x = x + y;
		y = x - y;
		x = x - y;
		
		System.out.println(x);
		System.out.println(y);
	}
}
