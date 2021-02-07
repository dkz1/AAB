package sort;

public class Shellsort {

	public static void main(String[] args) {
		int[] arr = {8,9,1,7,2,3,5,4,6,0};
	}

	//以下是交换法，但是执行速度反而变慢
	public static void shellSort(int[] arr) {
		int temp = 0;
		for(int gap = arr.length / 2; gap > 0; gap /= 2) {
			for(int i = gap;i < arr.length; i++) {
				for(int j = i-gap;j >= 0; j -= gap) {
					if(arr[j] > arr[j+gap]) {
						temp = arr[j];
						arr[j] = arr[j+gap];
						arr[j+gap] = temp;
					}
				}
			}
		}
	}
	
	//于是要用到移位法
	public static void shellSort2(int[] arr) {
		for(int gap = arr.length / 2; gap > 0; gap /= 2) {
			//从第gap个元素开始，逐个对其所在的组进行直接插入排序
			for(int i = gap; i < arr.length; i++) {
				int j = i;
				int temp = arr[j];
				if(arr[j] < arr[j-gap]) {
					while((j-gap) >= 0 && temp < arr[j-gap]) {
						//移动
						arr[j] = arr[j-gap];
						j -= gap;
					}
					//当退出while循环后，就表明找到了位置
					arr[j] = temp;
				}
			}
		}
	}
}
