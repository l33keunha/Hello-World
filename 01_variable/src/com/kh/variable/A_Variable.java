package com.kh.variable;
//package는 폴더를 뜻함  (.) 뜻하는 내용은 '~~로 내가 들어가겠다'
public class A_Variable {
//full name은 com.kh.variable.A_Varibale
	public void declareVariable() {
		// 변수 선언 후 초기화
		// A. 변수 선언: 공간 할당 -> 자료형 변수형;
		// 1. 논리형
		boolean isTrue;
		
		// 2. 숫자형
		// 2-1. 정수형
		byte bNum;
		short sNum;
		int iNum;
		long lNum;
		// 2-2. 정수형
		float fNum;
		double dNum;
		
		// 3. 문자형
		// 3-1. 문자
		char ch;
		// 3-2. 문자열
		String str;
		
		// B. 초기화(대입)
		isTrue = false;
		
		bNum = 1;
		sNum = 2;
		iNum = 4;
		lNum = 8L;
		
		fNum = 4.0f;
		dNum = 8.0d;
		
		ch = 'A'; //무조건 딱 한글자만 들어갈 수 있음
		str = "A";
		
		System.out.println("isTrue의 값: " + isTrue);
		System.out.println("bNum의 값: " + bNum);
		System.out.println("sNum의 값: " + sNum);
		System.out.println("iNum의 값: " + iNum);
		System.out.println("lNum의 값: " + lNum);
		System.out.println("fNum의 값: " + fNum);
		System.out.println("dNum의 값: " + dNum);
		System.out.println("ch의 값: " + ch);
		System.out.println("str의 값: " + str);
	}
	
	public void initVariable() {
		// 변수 선언과 동시에 초기화
		// 1. 논리형
		boolean isTrue = true;
		// 2. 숫자형
		// 2-1. 정수형
		byte bNum = 1;
		short sNum = 2;
		int iNum = 4;
		long lNum = 8L;
		// 2-2. 실수형
		float fNum = 4.0f;
		double dNum = 8.0d;
		
		// 3. 문자형
		// 3-1. 문자
		char ch = '가';
		// 3-2. 문자열
		String str = "KH정보교육원";
		
		System.out.println("isTure의 값 : " + isTrue);
		System.out.println("bNum의 값: " + bNum);
		System.out.println("sNum의 값: " + sNum);
		System.out.println("iNum의 값: " + iNum);
		System.out.println("lNum의 값: " + lNum);
		System.out.println("fNum의 값: " + fNum);
		System.out.println("dNum의 값: " + dNum);
		System.out.println("ch의 값: " + ch);
		System.out.println("str의 값: " + str);
	}
}
