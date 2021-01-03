package dkz;

import java.util.Scanner;

//   一年有12个月份，分属于春夏秋冬4个季节，键盘录入一个月份，判断是哪个季节并输出
//   春：3 4 5 
//   夏：6 7 8
//   秋：9 10 11
//   冬：12 1 2
public class Season {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in) ;
		int month = in.nextInt();
		switch(month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println(month+"月是春天");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month+"月是夏天");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month+"月是秋天");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println(month+"月是冬天");
			break;
			default:
				System.out.println("请输入正确的月份");
		}
	}
}
