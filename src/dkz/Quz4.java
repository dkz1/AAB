package dkz;


//   1.定义一个int类型的数组，内容为{171，72，19,16,118,51,210,7,18}
//   2.求出特定元素的和，特定元素是指十位和个位不包含7的偶数
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
