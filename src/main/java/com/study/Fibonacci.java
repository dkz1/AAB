package com.study;


//斐波那契数列
//斐波那契数列指的是这样一个数列 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233，377，610，987，1597，2584，4181，6765，10946，17711，28657，46368……。
//特别指出：第0项是0，第1项是第一个1。
//这个数列从第三项开始，每一项都等于前两项之和。
//使用两种方式来实现，递归、非递归方式。

public class Fibonacci {
	//递归算法
	public static long fibonacci(long number) {
		if(number == 0) {
			return 0;
		}else if(number == 1){
			return 1;
		}else {
			return fibonacci(number-1)+fibonacci(number-2);
		}
	}
	
	//非递归算法
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
