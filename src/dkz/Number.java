package dkz;


// ��ȡ10-99������10��99���ġ��ܺ͡��롰ż�����ĸ���
public class Number {
	public static void main(String[] args) {
		int count = 0;
		int sum = 0;
		for(int i = 10;i < 100;i++) {
			sum = sum + i;
			if(i % 2 == 0) {
				count += 1;
			}
		}
		System.out.println("�ܺ�Ϊ"+sum);
		System.out.println("ż���ĸ���Ϊ"+count);
	}
}
