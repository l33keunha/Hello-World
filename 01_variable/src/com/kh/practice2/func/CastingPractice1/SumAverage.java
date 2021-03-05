package com.kh.practice2.func.CastingPractice1;

import java.util.Scanner;

public class SumAverage {
	public void method2() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어의 점수는 : ");
		double lang = sc.nextDouble();
		
		System.out.print("영어의 점수는 : ");
		double eng = sc.nextDouble();
		
		System.out.print("수학의 점수는 : ");
		double math = sc.nextDouble();
		
		int sum = (int)(lang + eng + math);
		int average = (int)(lang + eng + math) /3 ;
		
		System.out.println("총점은 " + sum + "입니다.");
		System.out.println("평균은 " + average + "입니다.");
		
	}
}

// 실수형으로 국어, 영어, 수학 세 과목의 점수를 입력 받아 총점과 평균을 출력하세요.
// 이 때 총점과 평균은 정수형으로 처리하세요.
// 국어:
// 영어:
// 수학: 
// 총점:
// 평균:
