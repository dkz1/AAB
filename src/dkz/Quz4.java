package dkz;


//   1.����һ��int���͵����飬����Ϊ{171��72��19,16,118,51,210,7,18}
//   2.����ض�Ԫ�صĺͣ��ض�Ԫ����ָʮλ�͸�λ������7��ż��
public class Quz4 {
//	public static void special(int a) {
//		if(a % 10 != 7 && a / 10 % 10 != 7 && a % 2 == 0) {
//			
//		}
//	}
	public static void main(String[] args) {
		int[] num = {171,72,19,16,118,51,210,7,18};
		int sum = 0;
		for(int i = 0; i < 9; i++) {
			if(num[i] % 10 != 7 && num[i] / 10 % 10 != 7 && num[i] % 2 == 0) {
				sum = sum + num[i];
			}
		}
		System.out.println(sum);
	}
}
