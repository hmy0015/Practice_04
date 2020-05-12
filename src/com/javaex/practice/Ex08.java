package com.javaex.practice;

public class Ex08 {
	public static void main(String[] args) {
		
		int[] lottoNos = new int[6];
		
		for(int i = 0; i < lottoNos.length; i++) {
			lottoNos[i] = (int)(Math.random()*45)+1;
			
			for(int j = 0; j < i; j++) {
				while (lottoNos[j] == lottoNos[i]) {
					lottoNos[i] = (int)(Math.random()*45)+1;
					j = 0;
				}
			}
			System.out.print(lottoNos[i] + "\t");
		}
	}
}
