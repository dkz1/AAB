package dkz;


//   ����һ���������÷����������������е����ֵ��������Ե���

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
