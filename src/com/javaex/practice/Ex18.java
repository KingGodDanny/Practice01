package com.javaex.practice;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("화씨: ");
		double fah = sc.nextDouble();
		
		double cel = (double)5/9 * (fah - 32);
		
		System.out.println("화씨 " + fah + " 의 섭씨온도는 " + cel + " 입니다.");
		
		sc.close();

	}

}
