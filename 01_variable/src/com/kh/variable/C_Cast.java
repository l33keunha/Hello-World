package com.kh.variable;

public class C_Cast {
	public void rule1() {
		// �ڵ� ����ȯ
		int num = 'A';
		System.out.println("num : " + num);
		
		char ch = 97;
		//2byte   ���ͷ� (������� �� 4byte�� �ƴϰ� �׳� ���� �� ��ü��)
		System.out.println("ch : " + ch);
//		char ch2 = -97; 
		// char�� ���� �� ���� �Ұ��� => ����� ������ �� �ִ� �������� ����
		
		int num2 = -97;
		char ch2 = (char)num2;
		// �ȵǴ� ������ num2��ä�� �ڷ��� int�� �� �ְ� �̴� 4byte�̱� ������ char(2byte)�� �� �� ����
		System.out.println("ch2 : " + ch2);
		// ? �� ��µǴ� ������ '?' ���ڸ� ������ ���� �ƴ϶�, -97�� ��Ī�Ǵ� ���� ��� �𸣰ڴٴ� ����
		
		char ch3 = (char)num;
		System.out.println("ch3 : " + ch3);
	}
	
	public void rule2() {
		int iNum = 10;
		long lNum = 100L;
		
//		int sum = iNum + lNum;
		//	      int  + long
		//(�ڵ�����ȯ)long + long
		//  int  =    long
		
		// ���1. ���� ����� ������  int�� ���� ����ȯ
		int sum1 = (int)(iNum + lNum);
		System.out.println("sum1 : " + sum1);
		
		// ���2. long���� int�� ���� ����ȯ
		int sum2 = iNum + (int)lNum;
		System.out.println("sum2 : " + sum2);
		
		// ���3. long�� �ڷ������� �ޱ�
		long sum3 = iNum + lNum;
		System.out.println("sum3 : " + sum3);
		
		byte bNum = 1;
		short sNum = 2;
		
		short sSum = (short)(bNum + sNum);
		//           byte + short
		//			 1     2
		//			short + short : byte -> short �ڵ�����ȯ
		//			 = short
		// byte�� short�� ���� ����� ������ int�� ��
		// bNum + sNum�� short�� �����Ű�� ���ؼ� ���� ����ȯ �ʿ�
	}
	
	public void dataLoss() {
		int iNum = 290;
		System.out.println("iNum : " + iNum);
		
		byte bNum = (byte)iNum;
		System.out.println("bNum : " + bNum);
	}
}
