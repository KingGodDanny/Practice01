package com.javaex.practice;

public class Ex19 {

	public static void main(String[] args) {
		
		long speed = 300000L;  // 지정 빛의 속도
		long distance = speed * 365l * 24l * 60l * 60l; // 속도x365일x24시간x60분x60초
		
		System.out.println("빛이 1년동안 가는 거리는 " + distance + " km 입니다.");
		
		

	}

}
