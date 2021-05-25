package com.javaex.practice;

import java.util.Scanner;

public class Ex17 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름:  ");
		
		double radi = sc.nextDouble();
		double PI = 3.14;
		double volume = (double)4/3 * PI * (radi*radi*radi);
		
		System.out.println("구의부피는: " + volume + " 입니다.");
		
		sc.close();
		

	}

}
