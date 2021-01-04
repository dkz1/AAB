package com.study;


//쳲���������ָ��������һ������ 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233��377��610��987��1597��2584��4181��6765��10946��17711��28657��46368������
//�ر�ָ������0����0����1���ǵ�һ��1��
//������дӵ����ʼ��ÿһ�����ǰ����֮�͡�
//ʹ�����ַ�ʽ��ʵ�֣��ݹ顢�ǵݹ鷽ʽ��

public class Fibonacci {
	//�ݹ��㷨
	public static long fibonacci(long number) {
		if(number == 0) {
			return 0;
		}else if(number == 1){
			return 1;
		}else {
			return fibonacci(number-1)+fibonacci(number-2);
		}
	}
	
	//�ǵݹ��㷨
	public static long fibonacci2(long number) {
		long numberA = 0;
		long numberB = 1;
		for(int i = 2;i < number;i++) {
			long temp = numberA + numberB;
			numberA = numberB;
			numberB = temp;
		}
		return numberB;
	}
	
	public static void main(String[] args) {
		long a = fibonacci(5);
		System.out.print(a);
	}
}
