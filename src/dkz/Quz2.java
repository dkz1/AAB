package dkz;

import java.util.Scanner;

//  ����һ������Ϊ10��int���飬Ҫ���û�ʹ�ü���¼��ֱ�������ÿ��Ԫ�ظ�ֵ��������������������Ԫ�ص��ܺ�
//  ���ֵ����Сֵ������ӡ����

public class Quz2 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = new int[10];
		int sum = 0;
		int max = num[0];
		int min = num[0];
		for(int i = 0;i < 10;i++) {
			num[i] = in.nextInt();
			sum = sum + num[i];
			if(max > num[i]) {
				max = num[0];
			}
			else {
				max = num[i];
			}
			if(min < num[i]) {
				min = num[0];
			}
			else {
				min = num[i];
			}
		}
		System.out.println("�ܺ�Ϊ"+sum);
		System.out.println("���ֵΪ"+max);
		System.out.println("��СֵΪ"+min);
	}
}
