package com.kh.variable;

public class B_Constant {
	public void finalconstant() {
		int age; // �Ϲ� ���� ����
		final int AGE; // ��� ����
		
		age = 20;
		AGE = 20;
		
		System.out.println("age : " + age);
		System.out.println("AGE : " + AGE);
		
		// �� ����
		age = 30;
//		AGE = 30;
		// The final local variable AGE may already have been assigned
		// final �������� AGE�� �̹� �Ҵ��� �Ǿ��ִ�, ����� ������ �Ұ�
		
		System.out.println("�� ���� �� age : " + age);
		System.out.println("�� ���� �� AGE : " + AGE);
	}
}
