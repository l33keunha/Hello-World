package com.kh.practice2.func.CastingPractice1;

import java.util.Scanner;

public class UnicodePrint {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		 
		System.out.print("���ڸ� �Է��ϼ��� : ");
		String chrAny = sc.nextLine();
		char any = chrAny.charAt(0);
		int unicode = any;
		
		System.out.println("���� : " + any);
		System.out.println(any + "�� unicode�� : " + unicode);
	}
}

// Ű����� ���� �ϳ��� �Է� �޾� �� ������ �����ڵ带 ����ϼ���.
// ���� :
// ()unicode :