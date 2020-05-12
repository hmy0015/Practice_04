package com.javaex.practice;
import java.util.Scanner;

public class Ex07 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] wonArray = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
		int[] ea = new int[wonArray.length]; // 화폐 개수를 입력 받을 배열
		
		System.out.print("금액 : ");
		int won = sc.nextInt(); // 금액을 입력받을 변수
		sc.close();

		for(int i = 0; i < wonArray.length; i++) {
			if(wonArray[i] <= won) {
				ea[i] = won / wonArray[i];
				won = won % wonArray[i]; // 변수 안에 차액 담기
			}
			System.out.println(wonArray[i] + "원 : " + ea[i] + "개");
		}
	}
}
