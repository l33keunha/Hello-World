package com.kh.variable;

public class D_PrintMethod {
	public void printlnExample() {
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		
		System.out.println(str1); // 출력 + 줄바꿈
		System.out.println(); // 아무것도 출력하지 않고 줄바꿈만, 괄호 안을 비울 수 있는 건 ln만 가능
		System.out.println(str2);
		
	}
	
	public void printExample() {
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		
		System.out.print(str1); // 단순출력
		System.out.print(str2);
//		System.out.println(); // 아무런 내용도 보여주지 않음
	}
	
	public void printfExample() {
		String str1 = "안녕하세요";
		String str2 = "반갑습니다";
		
		System.out.printf("%s, 이근하입니다. %s.", str1, str2);
		// %는 구멍을 뚫어놨다고 보면됨, %s < 문자열만 알맞게 들어갈 수 있음, 형식이 맞다면 제대로 들어감
		System.out.printf("%s, 친하게 지내요.\n", str2);
		
//		System.out.println();
		
		// 미니 문제
		int age = 20;
		String name = "박신우";
		String job = "강사";
		// 안녕하세요, 저는 20살 박신우 강사입니다. 만나서 반갑습니다.
		System.out.printf("%s, 저는 %d살 %s %s입니다. 만나서 %s.", str1, age,name,job, str2);
		
	}
}
