package dkz;

import java.util.Scanner;

//  ���û��������ģ�Ӣ���ѧ�ɼ�������ܷ�С��180�֣������������������㣬�������ҳ����ġ�
//  ���������ͬ���壬������
//  ���㲻ͬ�����������ͬ�����ݣ�ֻ�����һ��
//  �ܷ�<180  ������мҳ�
//  �ܷ�>=180�������������������98��  �������ϲ��������ܴ�ӳ�
//  �ܷ�>=180��������������ܵ������������������������95��  �������ϲ���ΰ೤
//  �ܷ�>=180���Ǽ������������Ҳ�����˰೤�������  �����ͬ���壬������
public class Score {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("�������ĳɼ���");
		int chinese = in.nextInt();
		System.out.println("����Ӣ��ɼ���");
		int english = in.nextInt();
		System.out.println("������ѧ�ɼ���");
		int math = in.nextInt();
		int total = chinese+english+math;
		if(total < 180) {
			System.out.println("�мҳ�");
		}
		else if(total >= 180 && chinese > 98 && english > 98 && math > 98){
			System.out.println("��ϲ��������ܴ�ӳ�");
		}
		else if(total >= 180 && chinese > 95 && english > 95 && math > 95) {
			System.out.println("��ϲ���ΰ೤");
		}
		else {
			System.out.println("ͬ���壬������");
		}
	}
	
}
