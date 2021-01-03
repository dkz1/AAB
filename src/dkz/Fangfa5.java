package dkz;


//    定义一个方法，该方法可以求一个数组中的最大值
public class Fangfa5 {
	public static int max(int[] arrays){
		int x;
		x=arrays[0];
		for(int i = 0;i < arrays.length;i++) {
			if(arrays[i]>x) {
				x = arrays[i];
			}
		}
		return x;
	}
	public static void main(String[] args) {
		int[] numbers = {1,5,6,7,8,9,20,30};
		System.out.print(max(numbers));
	}
}
