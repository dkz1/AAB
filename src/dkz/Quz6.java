package dkz;


//   ��һ�����ӣ��ӳ����Ժ����������ÿ���¶���һ�����ӣ�С���ӳ����������º�����һ�����ӣ�
//   �������Ӷ��������ʵڶ�ʮ���µ����Ӷ���Ϊ����
public class Quz6 {
	public static int tuziA(int n) {
		int resultA = 1;
		int resultB = 1;
		for(int i = 3;i <= n; i++) {
			int result;
			result = resultA + resultB;
			resultA = resultB;
			resultB = result;
		}
		return resultB;
	}
	
	public static int tuziB(int n) {
		int[] month = new int[n];
		month[0] = 1;
		month[1] = 1;
		for(int i = 2;i < n;i++) {
			month[i]=month[i-2]+month[i-1];
		}
		return month[n-1];
	}
	public static void main(String[] args) {
		for(int i = 3;i<100 ;i++) {
			if(tuziA(i) != tuziB(i)) {
				System.out.print("��"+i+"���´���");
			}
		}
	}
}
