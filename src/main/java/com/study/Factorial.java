package com.study;


//����N���ڽ׳�
//ʹ�õݹ顢�ǵݹ����ַ�ʽʵ��


public class Factorial {
	// �ǵݹ��㷨
	public static int fac1(int n) {
		int result = n;
		while(n>1) {
			result = result * (n-1);
			n--;
		}
		return result;
	}
	
	//�ݹ��㷨
	public static int fac2(int n) {
		if(n == 1) {
			return 1;
		}else {
			return n*fac2(n-1);
		}
	}
	
	public static void main(String[] args) {
		int a = fac1(5);
		int b = fac2(5);
		System.out.println(a);
		System.out.print(b);
	}
}
