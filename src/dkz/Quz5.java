package dkz;

import java.util.Arrays;

//   ����һ�����飬�����Ԫ��Ϊ��{3,4,11,55,32,10,8,5}
//   Ҫ��ʹ�ô���Ը�������дӴ�С�����������Ϊ{55,32,11,10,8,5,4,3}
public class Quz5 {
	public static void main(String[] args) {
		int[] number = {3,4,11,55,32,10,8,5};
			Arrays.sort(number);
			for(int i = 0;i < number.length/2;i++) {
				int temp = number[i];
				number[i] = number[number.length-1-i];
				number[number.length-1-i] = temp;
			}
			for(int j=0;j<number.length;j++) {
				System.out.print(number[j]+" ");
			}
	}
}
