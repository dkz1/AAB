package dkz;


//   定义一个方法，该方法能求两个整数中的最大值。定义后尝试调用

public class Fangfa1 {
	public static int max(int a,int b) {
		int result;
		if(a > b) {
			result = a;
		}
		else {
			result = b;
		}
		return result;
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		System.out.print(max(a,b));
	}
}
