package com.kh.variable;

public class C_Cast {
	public void rule1() {
		// 자동 형변환
		int num = 'A';
		System.out.println("num : " + num);
		
		char ch = 97;
		//2byte   리터럴 (정수라고 다 4byte가 아니고 그냥 숫자 그 자체임)
		System.out.println("ch : " + ch);
//		char ch2 = -97; 
		// char는 음수 값 저장 불가능 => 양수만 저장할 수 있는 범위였기 때문
		
		int num2 = -97;
		char ch2 = (char)num2;
		// 안되는 이유는 num2자채는 자료형 int가 들어가 있고 이는 4byte이기 때문에 char(2byte)에 들어갈 수 없음
		System.out.println("ch2 : " + ch2);
		// ? 가 출력되는 이유는 '?' 문자를 가져온 것이 아니라, -97과 매칭되는 값이 없어서 모르겠다는 거임
		
		char ch3 = (char)num;
		System.out.println("ch3 : " + ch3);
	}
	
	public void rule2() {
		int iNum = 10;
		long lNum = 100L;
		
//		int sum = iNum + lNum;
		//	      int  + long
		//(자동형변환)long + long
		//  int  =    long
		
		// 방법1. 수행 결과를 강제로  int로 강제 형변환
		int sum1 = (int)(iNum + lNum);
		System.out.println("sum1 : " + sum1);
		
		// 방법2. long형을 int로 강제 형변환
		int sum2 = iNum + (int)lNum;
		System.out.println("sum2 : " + sum2);
		
		// 방법3. long형 자료형으로 받기
		long sum3 = iNum + lNum;
		System.out.println("sum3 : " + sum3);
		
		byte bNum = 1;
		short sNum = 2;
		
		short sSum = (short)(bNum + sNum);
		//           byte + short
		//			 1     2
		//			short + short : byte -> short 자동형변환
		//			 = short
		// byte와 short의 연산 결과는 무조건 int가 됨
		// bNum + sNum을 short에 저장시키기 위해서 강제 형변환 필요
	}
	
	public void dataLoss() {
		int iNum = 290;
		System.out.println("iNum : " + iNum);
		
		byte bNum = (byte)iNum;
		System.out.println("bNum : " + bNum);
	}
}
