package dkz;


//   ������������Ϊ5���ַ�������arrA��arrB��arrA����Ԫ��{"1","2","3","4","5"},
//   arrA�е�����Ԫ�ذ����򴢴�������arrB�У���ӡ��arrB
public class Quz3 {
	public static void main(String[] args) {
		String[] arrA = {"1","2","3","4","5"};
		System.out.print("arrB��Ԫ����: ");
		for(int i = 0;i < arrA.length/2;i++) {
				String temp = arrA[i];
				arrA[i] = arrA[arrA.length-1-i];
				arrA[arrA.length-1-i] = temp;
		}
		for(int j = 0;j < arrA.length;j++) {
			System.out.print(arrA[j]);
		}
	}
}
