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
		
		System.out.println(3 != 2);
		
		int len = s.length();
		System.out.println("len=" + len);
		System.out.println(s.charAt(0));
		
		float a = 5.0f;
		int b = 5;
		int d = 3;
		float e = a/d;
		System.out.println(e);
		System.out.println(b >> 2);	//位元推移
		b=b++;	//b=b+1
		System.out.println(b);
		
//		字串轉整數
		String data = "123";
		int n = Integer.parseInt(data);
		
//		整數轉字串
		String mydata = String.valueOf(n);
		
	}
		
}
