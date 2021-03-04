package com.kh.practice2.func.CastingPractice1;

import java.util.Scanner;

public class UnicodePrint {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("문자를 입력하세요 : ");
		String chrAny = sc.nextLine();
		char any = chrAny.charAt(0);
		int unicode = any;
		
		System.out.println("문자 : " + any);
		System.out.println(any + "의 unicode는 : " + unicode);
	}
}

// 키보드로 문자 하나를 입력 받아 그 문자의 유니코드를 출력하세요.
// 문자 :
// ()unicode :