package dkz;


//   ����һ������Ϊ100�����飬Ҫ�������Ԫ�طֱ���1,3,5,7,9.....���Ҫ���������ÿ��Ԫ�ض���ӡ����
public class Quz1 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		for(int i = 0;i<100;i++) {
			numbers[i]=2*i+1;
			System.out.print(numbers[i]+" ");
		}
	}
}
