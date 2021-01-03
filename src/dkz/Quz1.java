package dkz;


//   定义一个长度为100的数组，要求里面的元素分别是1,3,5,7,9.....最后还要把数组里的每个元素都打印出来
public class Quz1 {
	public static void main(String[] args) {
		int[] numbers = new int[100];
		for(int i = 0;i<100;i++) {
			numbers[i]=2*i+1;
			System.out.print(numbers[i]+" ");
		}
	}
}
