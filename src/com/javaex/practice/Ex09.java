package com.javaex.practice;

public class Ex09 {

	public static void main(String[] args) {
		
//		double f = 80.0;
//		System.out.println(5/9*(f-32.0));

		
		// 0이 나오는 이유는 5나누기9는 0.5555555555555... 이지만 자료형이 선언이 되지않았기때문에 0이 되었고 48.0에 0을 곱해도 결국
		// 0이되기때문이다
		
		
		double f = 80.0;
		System.out.println((double)5/9*(f-32.0));
	}

		// 정상적인 출력값이 나오기 위해선 5/9의 값이 0이 되지 않게하기위해 
		// 앞에 플롯이나 더블을 붙여서 형변환을 해줘야한다.
}
