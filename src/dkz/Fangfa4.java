package dkz;


//   ����һ�����������Դ�ӡһ�����飬��ʽ���£�{1,2,3,4,5}
public class Fangfa4 {
	public static void numbers(int[] a) {
		System.out.print("{");
		for(int i = 0;i<a.length ;i++) {
			if(i<a.length-1) {
				System.out.print(a[i]+",");
			}
			else {
				System.out.print(a[i]);
			}
		}
		System.out.print("}");
	}
	public static void main(String[] args) {
		int[] a = {1,2,3,4,5};
		numbers(a);
	}

}
