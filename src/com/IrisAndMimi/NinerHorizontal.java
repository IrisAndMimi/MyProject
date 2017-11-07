package com.IrisAndMimi;

public class NinerHorizontal {
	public static void main(String[] args) {
		for (int a=1; a<=9 ;a++){
			
			for (int n=2; n<=9 ;n++){
				if (a*n/10 ==0){
					System.out.print(n+" x "+a+" =  "+a*n);
				}else{
					System.out.print(n+" x "+a+" = "+a*n);
				}
				System.out.print("\t");
			}
			System.out.println();
		}
		
	}
}
