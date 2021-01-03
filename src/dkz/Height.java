package dkz;


//   我国最高的山峰是珠穆朗玛峰：8848m，现在有一张足够大的纸，厚度为0.01m，请问折叠多少次，可以保证纸的厚度不低于珠穆朗玛峰
public class Height {
	public static void main(String[] args) {
		int zhu = 8848;
		int count = 0;
		double i = 0.01;
		do{
			i *= 2;
			count += 1;
		}while(i<zhu);
		System.out.println("要折叠"+count+"次");
	}
}
