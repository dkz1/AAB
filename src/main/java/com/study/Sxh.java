package com.study;


//打印N以内的“水仙花数”
//所谓"水仙花数"是指一个三位数，其各位数字立方和等于该数本身。例如：153是一个"水仙花数"，
//因为153=1的三次方＋5的三次方＋3的三次方

public class Sxh {
	public static void sxhs(int x) {
		int a = x % 10;  //个位数
		int b = (x/10) % 10;  //十位数
		int c = x/100;   //百位数
		for(int i =100; i < 999;i++) {
			int y = a*a*a+b*b*b+c*c*c;
					if(x == y) {
						System.out.print(x+" ");
					}
		}
	}
}
