package dkz;

import java.util.Scanner;

//  定义一个长度为10的int数组，要求用户使用键盘录入分别给数组的每个元素赋值。最后计算出该数组的所有元素的总和
//  最大值，最小值，并打印出来

public class Quz2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = new int[10];
		int sum = 0;
		int max = num[0];
		int min = num[0];
		for(int i = 0;i < 10;i++) {
			num[i] = in.nextInt();
			sum = sum + num[i];
			if(max > num[i]) {
				max = num[0];
			}
			else {
				max = num[i];
			}
			if(min < num[i]) {
				min = num[0];
			}
			else {
				min = num[i];
			}
		}
		System.out.println("总和为"+sum);
		System.out.println("最大值为"+max);
		System.out.println("最小值为"+min);
	}
}
