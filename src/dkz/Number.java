package dkz;


// 获取10-99（包含10和99）的“总和”与“偶数”的个数
public class Number {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for(int i = 10;i < 100;i++) {
			sum = sum + i;
			if(i % 2 == 0) {
				count += 1;
			}
		}
		System.out.println("总和为"+sum);
		System.out.println("偶数的个数为"+count);
	}
}
