package com.study;


//��ӡN���ڵġ�ˮ�ɻ�����
//��ν"ˮ�ɻ���"��ָһ����λ�������λ���������͵��ڸ����������磺153��һ��"ˮ�ɻ���"��
//��Ϊ153=1�����η���5�����η���3�����η�


public class Sxh {
	public static void sxhs(int x) {
		int a = x % 10;  //��λ��
		int b = (x/10) % 10;  //ʮλ��
		int c = x/100;   //��λ��
		for(int i =100; i < 999;i++) {
			int y = a*a*a+b*b*b+c*c*c;
					if(x == y) {
						System.out.print(x+" ");
					}
		}
	}
}
