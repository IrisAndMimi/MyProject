package com.IrisAndMimi;

import java.util.Scanner;

public class Odd {

	public static void main(String[] args) {
		
	System.out.println("輸入數字唄");
	Scanner scanner = new Scanner(System.in);
	String line = scanner.nextLine();
	int n = Integer.parseInt(line);
		if (n % 2 ==1){
			System.out.println("這是奇數");
		}else if (n % 2 ==0){
			System.out.println("這是偶數");
		}else if (n < 0){
			System.out.println("這是負數");
		}
		
	}

}
