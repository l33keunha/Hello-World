package com.kh.variable;

public class D_PrintMethod {
	public void printlnExample() {
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";
		
		System.out.println(str1); // ��� + �ٹٲ�
		System.out.println(); // �ƹ��͵� ������� �ʰ� �ٹٲ޸�, ��ȣ ���� ��� �� �ִ� �� ln�� ����
		System.out.println(str2);
		
	}
	
	public void printExample() {
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";
		
		System.out.print(str1); // �ܼ����
		System.out.print(str2);
//		System.out.println(); // �ƹ��� ���뵵 �������� ����
	}
	
	public void printfExample() {
		String str1 = "�ȳ��ϼ���";
		String str2 = "�ݰ����ϴ�";
		
		System.out.printf("%s, �̱����Դϴ�. %s.", str1, str2);
		// %�� ������ �վ���ٰ� �����, %s < ���ڿ��� �˸°� �� �� ����, ������ �´ٸ� ����� ��
		System.out.printf("%s, ģ�ϰ� ������.\n", str2);
		
//		System.out.println();
		
		// �̴� ����
		int age = 20;
		String name = "�ڽſ�";
		String job = "����";
		// �ȳ��ϼ���, ���� 20�� �ڽſ� �����Դϴ�. ������ �ݰ����ϴ�.
		System.out.printf("%s, ���� %d�� %s %s�Դϴ�. ������ %s.", str1, age,name,job, str2);
		
	}
}
