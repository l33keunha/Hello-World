package com.kh.variable;

import java.util.Scanner;

public class E_KeyboardInput {
	
	public void inputScanner1() {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine(); 
		// ����ڷκ��� �Է¹ޱ� ���� ��, ���ڿ��� ���� ������ ����ϰ� ����
		// �Ʒ� â���� '�ƹ��ų�'�� �Է��ϸ� [ nextLine() ] ���� �Ѿ�� �� ��ü�� '�ƹ��ų�'�� ��
		// �޾��� ���� ������ ��~ ���ư�. �޾��� ���� ����
		// �������� ���� ������ ��������� ����־���
		// ex) �Է°�'�̱���' -> sc.nextLine -> name������ ��� -> prntln�� name���� '�̱���'�� ���

		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		System.out.print("Ű(�Ҽ��� ù°�ڸ����� �Է�) : ");
		double height = sc.nextDouble();
	
		System.out.println(name + "���� " + age + "���̸�, Ű�� " + height + "cm�Դϴ�."); 
	}
	
	public void inputScanner2() {
		Scanner sc = new Scanner(System.in); //�˸��� �����, ���� Ŭ���� �������� �� import ���ص� ��
		
		System.out.print("�̸��� �Է��ϼ��� : ");
		String name = sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ��� : ");
//		int age = sc.nextInt();
//	
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();
		
		// 1. next()�� �ּ� �ޱ�
		// next�� ���⸦ �����ڷ� �ν�, ���Ⱑ ������ ó�� �� ���� �о��
		// �� �о������ �׸�ŭ�� next()�޼ҵ带 ������� ��
//		int age = sc.nextInt();
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.next();

		// 2. nextLine() �߰� �� ���� �ּ� �ޱ�
//		// nextLine�� ���⸦ �����ڷ� �ν����� ����
//		int age = sc.nextInt();
//		
//		sc.nextLine(); // ���ۿ� �������ִ� �ٹٲ��� ���ִ� �뵵
//		
//		System.out.print("�ּҸ� �Է��ϼ��� : ");
//		String address = sc.nextLine();
		
		// 3. age�� nextLine()���� ���� �� ������ �Ľ��ϱ�
		// �Ľ� : ���ڿ��� �⺻�ڷ������� ����
		String strAge = sc.nextLine();
		int age = Integer.parseInt(strAge);
		
		System.out.print("�ּҸ� �Է��ϼ��� : ");
		String address = sc.nextLine();
		
		System.out.print("������ �Է��ϼ���(M/F) : ");
		String strGender = sc.nextLine();
		char gender = strGender.charAt(0);
		
		
		System.out.println(name + "(" + age + "," + gender + ")" + "���� " + age + "���̸�, ��� ���� " + address + "�Դϴ�."); 
	}
}

		