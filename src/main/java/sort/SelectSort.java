package sort;

public class SelectSort {

	public static void selectSort(int[] arr) {
		for(int i = 0;i < arr.length-1;i++) {
			int minIndex = i;
			int min = i;
			for(int j = i+1; j < arr.length;j++) {
				if(min > arr[j]) {   //假定的最小值，并不是真正的最小值
					min = arr[j];    //重置最小值
					minIndex = j;	 //重置最小值的索引
				}
			}
			if(minIndex != i) {
				arr[minIndex] = arr[i];
				arr[i] = min;
			}
		}
	}

}
