package com.IrisAndMimi;

public class Niner {
	public static void main(String[] args) {
		for (int a=1; a<=9 ;a++){
			for (int n=1; n<=9 ;n++){
				if (a*n/10 ==0){
					System.out.println(a+" x "+n+" =  "+a*n);
				}else{
					System.out.println(a+" x "+n+" = "+a*n);
				}
			}
			System.out.println();
		}
		
	}
}
