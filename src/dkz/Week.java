package dkz;

import java.util.Scanner;

//  ��������0-6֮����������ֱ���������յ��������ڿ���̨���������
//  ���������0-6����������������������0-6֮���������
public class Week {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int day = in.nextInt();
//		switch(day) {
//		case 0 :
//			System.out.println("������");
//			break;
//		case 1 :
//			System.out.println("����һ");
//			break;
//		case 2 :
//			System.out.println("���ڶ�");
//			break;
//		case 3 :
//			System.out.println("������");
//			break;
//		case 4 :
//			System.out.println("������");
//			break;
//		case 5 :
//			System.out.println("������");
//			break;
//		case 6 :
//			System.out.println("������");
//			break;
//			default :
//				System.out.println("������0-6֮�������");
//		}
		String [] week = {"������","����һ","���ڶ�","������","������","������","������"};
		switch(day) {
		case 0 :
		case 1 :
		case 2 :
		case 3 :
		case 4 :
		case 5 :
		case 6 :
			System.out.println(week[day]);
			default :
				System.out.println("������0-6֮�������");
		}
	}
		
}
