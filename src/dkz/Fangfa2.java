package dkz;


//   定义一个方法，该方法能够打印两个整数的最大值，定义后调用
public class Fangfa2 {
	public static void max(int a,int b) {
		int result;
		if(a < b) {
			result = b;
		}
		else {
			result = a;
		}
		System.out.print(result);
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		max(a,b);
	}

}
