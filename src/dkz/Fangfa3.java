package dkz;


//   ����һ���������÷��������������������ֵ������������
public class Fangfa3 {
	public static int max(int a ,int b , int c) {
		int result;
		if(a>b && a>c) {
			result = a;
		}
		else if(b>a && b>c) {
			result = b;
		}
		else {
			result = c;
		}
		return result;
	}
	public static void main(String[] args) {
		int a = 10;
		int b = 20;
		int c = 30;
		System.out.print(max(a,b,c));
	}

}
