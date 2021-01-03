package dkz;



//   定义一个方法，该方法可以把一个数组进行排序（从小到大）
public class Fangfa6 {
	public static int[] paiXu(int[] arrays) {
		for(int k =0;k < arrays.length;k++) {
			for(int i = 0;i < arrays.length-1;i++) {
				if(arrays[i+1]<arrays[i]) {
					int temp;
					temp = arrays[i];
					arrays[i] = arrays[i+1];
					arrays[i+1] = temp;
				}
			}
		}
		return arrays;
	}
	public static void main(String[] args) {
		int[] numbers = {9,3,15,11,6,20};
		int[] result = paiXu(numbers);
		for(int i = 0;i<result.length;i++) {
			System.out.print(result[i]+" ");
		}
	}

}
