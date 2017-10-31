package com.IrisAndMimi;

import java.util.Scanner;

public class AgeTester {

	public static void main(String[] args) {
		System.out.println("您貴庚?");
		Scanner scanner = new Scanner(System.in);
		String Usrage = scanner.nextLine();
		int age = Integer.parseInt(Usrage);
		if (age < 12){
			System.out.println("小學生膩?");
		}else{
			if (age < 15){System.out.println("國中生逆?");
			}else{
				if (age < 18){System.out.println("高生逆?");
			}else{
				if (age < 22){System.out.println("大學牲逆?");
			}else{System.out.println("......");
				for (int i=0; i<5 ;i++){
					System.out.println("哈哈哈");}
				}
			}
			
			}
		
		}
			
	}

}
