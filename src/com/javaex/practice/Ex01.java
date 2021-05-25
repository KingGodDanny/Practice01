package com.javaex.practice;

public class Ex01 {

	public static void main(String[] args) {
		
		boolean a = true;               //int true;   --> true는 예약어라서 변수로 쓸수없다.
		System.out.println(a);
		
		int _of_workers = 10;             // int #_of_workers;  -->  $와 _이외 다른 특수문자 불가해서 #을 지워준다.
		System.out.println(_of_workers);
		
		int countOfLettersinstring = 3;  //int countOfLettersinString;  --> int는 정수값을 표현해주는 자료형이기 때문에 문자열인 스트링으로 바꿔준다.
		System.out.println(countOfLettersinstring);
		
		int firstLv1 = 2;                   //int 1stLevel1; --> 변수에는 숫자로 시작할수 없기 때문에 바꿔준다.   
		System.out.println(firstLv1);
		
		int person = 1;                     //int person#;	 --> #은 쓸수없음.				
		System.out.println(person);
		
		int _person = 5;					//int _person은 앞에 _가 올수있기때문에 가능하다. 
		System.out.println(_person);       
		
	}

}
