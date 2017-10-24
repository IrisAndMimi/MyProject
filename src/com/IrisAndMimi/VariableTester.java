package com.IrisAndMimi;

import java.util.Random;

public class VariableTester {

	public static void main(String[] args) {
		int age = 0;
		float weight = 0.0f;	//轉型
		char c = 65;
		char c2 = 'Z';
		
		int i = c2;
		System.out.println(i);
//		System.out.println((int)c2);
		boolean pass = true;
		System.out.println(pass);
		
		String s = new String("Hello");
		Random r = new Random();
		
		System.out.println(r.nextInt());
		int n1  = r.nextInt(6)+1;
		
		System.out.println(!(3 == 2));
		
		int len = s.length();
		System.out.println("len=" + len);
		System.out.println(s.charAt(0));
		
		
	}
		
}
