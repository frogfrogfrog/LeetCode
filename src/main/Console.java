package main;

import medium.TwoSum;

public class Console {
	public static void main(String[] args){
		int[] a={3,2,4};
		int[] b=new TwoSum().twoSum(a, 6);
		System.out.println(b[0]+","+b[1]);
	}
}
