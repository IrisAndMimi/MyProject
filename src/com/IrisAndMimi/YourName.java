package com.IrisAndMimi;

import java.util.Scanner;

public class YourName {
	
	public static void main(String[] args) {
		System.out.println("輸入您的名字plz~");
		Scanner scanner = new Scanner(System.in);
		String UsrNam = scanner.nextLine();
		System.out.println("早呀," + UsrNam);
		
		System.out.println("那你幾歲?");
		UsrNam = scanner.nextLine();
		int age = Integer.parseInt(UsrNam);
		if (age==19) 
			System.out.println("哇 跟我一樣");
		else System.out.println("呵呵");
		
		
	}

}
