package dkz;


//   有一对兔子，从出生以后第三个月起每个月都生一对兔子，小兔子长到第三个月后又生一对兔子，
//   假如兔子都不死，问第二十个月的兔子对数为多少
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
				System.out.print("第"+i+"个月错误");
			}
		}
	}
}
