package dkz;


//   定义两个长度为5的字符串数组arrA和arrB，arrA包含元素{"1","2","3","4","5"},
//   arrA中的所有元素按逆序储存在数组arrB中，打印出arrB
public class Quz3 {
	public static void main(String[] args) {
		String[] arrA = {"1","2","3","4","5"};
		System.out.print("arrB的元素是: ");
		for(int i = 0;i < arrA.length/2;i++) {
				String temp = arrA[i];
				arrA[i] = arrA[arrA.length-1-i];
				arrA[arrA.length-1-i] = temp;
		}
		for(int j = 0;j < arrA.length;j++) {
			System.out.print(arrA[j]);
		}
	}
}
