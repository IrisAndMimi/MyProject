package com.IrisAndMimi;

public class PrimeNumber {
	public static void main(String[] args) {
		int n = 97;
		boolean prime = true;
		for (int i=2; i<n; i++){
			if(n % i == 0){
				prime = false;
				break;
			}
		}
		if (prime){
			System.out.println(n+" is prime number.");
		}else{
				System.out.println("Not Prime");
		}
	}
}
