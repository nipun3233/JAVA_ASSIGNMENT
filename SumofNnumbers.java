package com.geeks;

public class SumofNnumbers {
	public static void main(String args[]) {
		int[] arr = {3,5,9,11,36,36,34,40,56};
		int sum = 0;
		for(int i=0; i<arr.length; i++) {
			sum = sum + arr[i];
		}
		System.out.println(sum);
	}
}



