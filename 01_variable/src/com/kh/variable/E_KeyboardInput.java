package com.kh.variable;

import java.util.Scanner;

public class E_KeyboardInput {
	
	public void inputScanner1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine(); 
		// 사용자로부터 입력받기 위한 것, 문자열이 들어올 때까지 대기하고 있음
		// 아래 창에서 '아무거나'를 입력하면 [ nextLine() ] 으로 넘어가고 이 자체가 '아무거나'가 됨
		// 받아줄 것이 없으면 휭~ 날아감. 받아줄 것은 변수
		// 오른쪽의 값을 왼쪽의 저장공간에 집어넣어줌
		// ex) 입력값'이근하' -> sc.nextLine -> name변수에 담김 -> prntln이 name변수 '이근하'값 출력

		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		System.out.print("키(소수점 첫째자리까지 입력) : ");
		double height = sc.nextDouble();
	
		System.out.println(name + "님은 " + age + "세이며, 키는 " + height + "cm입니다."); 
	}
	
	public void inputScanner2() {
		Scanner sc = new Scanner(System.in); //알맹이 만들기, 같은 클래스 내에서는 또 import 안해도 됨
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.nextLine();
		
		System.out.print("나이를 입력하세요 : ");
//		int age = sc.nextInt();
//	
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();
		
		// 1. next()로 주소 받기
		// next는 띄어쓰기를 구분자로 인식, 띄어쓰기가 있으면 처음 쓴 값만 읽어옴
		// 다 읽어오려면 그만큼의 next()메소드를 적어줘야 함
//		int age = sc.nextInt();
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.next();

		// 2. nextLine() 추가 후 으로 주소 받기
//		// nextLine은 띄어쓰기를 구분자로 인식하지 않음
//		int age = sc.nextInt();
//		
//		sc.nextLine(); // 버퍼에 남겨져있는 줄바꿈을 없애는 용도
//		
//		System.out.print("주소를 입력하세요 : ");
//		String address = sc.nextLine();
		
		// 3. age를 nextLine()으로 받은 후 정수로 파싱하기
		// 파싱 : 문자열을 기본자료형으로 변경
		String strAge = sc.nextLine();
		int age = Integer.parseInt(strAge);
		
		System.out.print("주소를 입력하세요 : ");
		String address = sc.nextLine();
		
		System.out.print("성별을 입력하세요(M/F) : ");
		String strGender = sc.nextLine();
		char gender = strGender.charAt(0);
		
		
		System.out.println(name + "(" + age + "," + gender + ")" + "님은 " + age + "세이며, 사는 곳은 " + address + "입니다."); 
	}
}

		