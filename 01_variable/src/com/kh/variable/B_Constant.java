package com.kh.variable;

public class B_Constant {
	public void finalconstant() {
		int age; // 일반 변수 선언
		final int AGE; // 상수 선언
		
		age = 20;
		AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		// 값 변경
		age = 30;
//		AGE = 30;
		// The final local variable AGE may already have been assigned
		// final 지역변수 AGE는 이미 할당이 되어있다, 상수는 변경이 불가
		
		System.out.println("값 변경 후 age : " + age);
		System.out.println("값 변경 후 AGE : " + AGE);
	}
}
