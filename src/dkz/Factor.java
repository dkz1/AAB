package dkz;


//   ����ѧ�У�10������10�Ľ׳ˣ���1*2*3*...*10��д��8���Ľ��
public class Factor {
	public static void main(String[] args) {
		int product = 1;
		for(int i = 1;i < 9; i++) {
			product *= i;
		}
		System.out.println("8�Ľ׳�Ϊ"+product);
	}
}
