package com.kh.practice2.func.CastingPractice1;

import java.util.Scanner;

public class SumAverage {
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("������ ������ : ");
		double lang = sc.nextDouble();
		
		System.out.print("������ ������ : ");
		double eng = sc.nextDouble();
		
		System.out.print("������ ������ : ");
		double math = sc.nextDouble();
		
		int sum = (int)(lang + eng + math);
		int average = (int)(lang + eng + math) /3 ;
		
		System.out.println("������ " + sum + "�Դϴ�.");
		System.out.println("����� " + average + "�Դϴ�.");
		
	}
}

// �Ǽ������� ����, ����, ���� �� ������ ������ �Է� �޾� ������ ����� ����ϼ���.
// �� �� ������ ����� ���������� ó���ϼ���.
// ����:
// ����:
// ����: 
// ����:
// ���:
