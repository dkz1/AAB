package dkz;


//   ����һ���������÷����ܹ���ӡ�������������ֵ����������
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
