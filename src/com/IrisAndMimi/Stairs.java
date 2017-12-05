package com.IrisAndMimi;

public class Stairs {

	public static void main(String[] args) {
//		int r= 6;
//		for(int n=1; n<r+1 ;n++){
//			for(int a=1; a<n+1 ;a++){
//				System.out.print("*");
//			}
//			System.out.println();
//		}
		int r= 6;
		for(int n=1; n<r+1 ;n++){
			for(int a=1; a<n+1 ;a++){
				System.out.print("*");
			}
			for(int b=r-n; b>0 ;b--){
				System.out.print("#");
			}
			System.out.println();
		}
		
	}

}
