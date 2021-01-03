package dkz;


//   在数学中，10！代表10的阶乘，即1*2*3*...*10，写出8！的结果
public class Factor {
	public static void main(String[] args) {
		int product = 1;
		for(int i = 1;i < 9; i++) {
			product *= i;
		}
		System.out.println("8的阶乘为"+product);
	}
}
