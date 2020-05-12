package com.javaex.practice;

public class Ex02 {
	public static void main(String[] args) {
		double[] doubleArray = {1.2, 3.3, 6.7};

		for(int i = 0; i < doubleArray.length; i++) {
			System.out.println(doubleArray[2 - i]);
		}
	}
}