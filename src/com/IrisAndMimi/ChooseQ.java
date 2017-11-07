package com.IrisAndMimi;

import java.util.Scanner;

public class ChooseQ {

	public static void main(String[] args) {
		System.out.println("問題:以下誰最老?");
		System.out.println("1) 周杰倫");
		System.out.println("2) 華晨宇");
		System.out.println("3) 梁朝偉");
		Scanner scanner = new Scanner(System.in);
		String Ans = scanner.nextLine();
		int ans = Integer.parseInt(Ans);
		if (ans < 3){
			System.out.println("錯的");
		}else{
			System.out.println("對的");
		}
	}

}
