package sort;

public class BubbleSort {
//冒泡排序，用逐个比较交换的方式，每次将最大的数放到数组的最后，结束一轮，下一轮就少一次循环
	public static void Bubblesort(int[] arr) {
		int temp = 0;
		boolean flag = false;  //用于表示此轮循环是否进行过交换   对冒泡排序效率的优化
		for(int i = 0; i < arr.length-1;i++) {
			
			for(int j = 0; j < arr.length - 1 - i; j++) {
				if(arr[j] > arr[j+1]) {
					flag = true;
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
			if(flag == false) {//在一轮排序种，没有进行过一次交换操作
				break;
			}else {
				flag = false;   //将flag重置为false，以便进行下一轮循环
			}
		}
	}

}
