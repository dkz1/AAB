package com.study;

public class Sushu {
	//�ж�101-200֮���ж��ٸ����������������������
	
	public static int sushu(int m,int n) {
		int cnt = 0;
		final int a = m;
		final int b = n;
		for(int i = a;i < (b+1);i++) {
			boolean isPrime = false;
			for(int j = 2; j <= Math.sqrt(i);j++) {
				if(i % j == 0) {
					isPrime = false;
					break;
				}else {
					isPrime = true;
				}
			}
			if(isPrime) {
				cnt++;
				System.out.print(i+" ");
			}
		}
		return cnt;
	}
	
	
	public static void main(String[] args) {
		System.out.print(Sushu.sushu(101, 200));
	}
}
