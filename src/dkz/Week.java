package dkz;

import java.util.Scanner;

//  键盘输入0-6之间的整数，分别代表星期日到星期六在控制台进行输出。
//  如果输入了0-6以外的数，则输出：请输入0-6之间的整数。
public class Week {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
		int day = in.nextInt();
//		switch(day) {
//		case 0 :
//			System.out.println("星期日");
//			break;
//		case 1 :
//			System.out.println("星期一");
//			break;
//		case 2 :
//			System.out.println("星期二");
//			break;
//		case 3 :
//			System.out.println("星期三");
//			break;
//		case 4 :
//			System.out.println("星期四");
//			break;
//		case 5 :
//			System.out.println("星期五");
//			break;
//		case 6 :
//			System.out.println("星期六");
//			break;
//			default :
//				System.out.println("请输入0-6之间的整数");
//		}
		String [] week = {"星期日","星期一","星期二","星期三","星期四","星期五","星期六"};
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
				System.out.println("请输入0-6之间的整数");
		}
	}
		
}
