package dkz;

import java.util.Scanner;

//   һ����12���·ݣ������ڴ����ﶬ4�����ڣ�����¼��һ���·ݣ��ж����ĸ����ڲ����
//   ����3 4 5 
//   �ģ�6 7 8
//   �9 10 11
//   ����12 1 2
public class Season {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in) ;
		int month = in.nextInt();
		switch(month) {
		case 3 :
		case 4 :
		case 5 :
			System.out.println(month+"���Ǵ���");
			break;
		case 6 :
		case 7 :
		case 8 :
			System.out.println(month+"��������");
			break;
		case 9 :
		case 10 :
		case 11 :
			System.out.println(month+"��������");
			break;
		case 12 :
		case 1 :
		case 2 :
			System.out.println(month+"���Ƕ���");
			break;
			default:
				System.out.println("��������ȷ���·�");
		}
	}
}
