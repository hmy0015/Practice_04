package com.javaex.practice;
import java.util.Scanner;

public class Ex05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double sum = 0;
		double[] num = new double[5];
		
		System.out.println("다섯개의 숫자를 입력하세요.");
		
		for(int i = 0; i < num.length; i++) {
			num[i] = sc.nextInt();
		}

		for(int j = 0; j < num.length; j++) {
			sum += num[j];
		}
		
		System.out.println("평균은 " + sum / 5 + "입니다.");
		sc.close();
	}
}
