package dkz;


//   �ҹ���ߵ�ɽ������������壺8848m��������һ���㹻���ֽ�����Ϊ0.01m�������۵����ٴΣ����Ա�ֽ֤�ĺ�Ȳ��������������
public class Height {
	public static void main(String[] args) {
		int zhu = 8848;
		int count = 0;
		double i = 0.01;
		do{
			i *= 2;
			count += 1;
		}while(i<zhu);
		System.out.println("Ҫ�۵�"+count+"��");
	}
}
