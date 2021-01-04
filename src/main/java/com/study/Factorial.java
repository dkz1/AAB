package com.study;


//   计算N以内阶乘
//   使用递归、非递归两种方式实现

public class Factorial {
	// 非递归算法
	public static int fac1(int n) {
		int result = n;
		while(n>1) {
			result = result * (n-1);
			n--;
		}
		return result;
	}
	
	//递归算法
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
