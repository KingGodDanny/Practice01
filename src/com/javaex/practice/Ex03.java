package com.javaex.practice;

public class Ex03 {

	public static void main(String[] args) {
		
		System.out.println("증가 감소 연산자");
		
		int x = 1;
		int y = 1;
		
		int a = ++x * 2;                      //여기서 a의 값은 4가될것이고 x의값은 2로 시작할것이고
		int b = y++ * 2;			          //여기서 b의 값은 2일될것이고 y의값은 현재는 1  
											  //두번째 출력됐을때부터 2일것이다. 
		
		System.out.println("a=" + a);		// a= 4가 될것이다 a는 x앞에 ++이 붙었기때문에 바로 2가된다.
		System.out.println("b=" + b);		// b= 2이 될것이다 b는 y뒤에 ++이 붙었기때문에 현재는 1 에 x 2여서 2가된다.
		System.out.println("x=" + x);		// x= 2일 것이다.  x 앞에 ++이기때문에 첫출력부터 2가됐다.
		System.out.println("y=" + y);		// y= 2일 것이다.  y는 뒤에 ++이 붙었지만 위에서 한번 출력됐기때문에 2가된다.
	}

}
