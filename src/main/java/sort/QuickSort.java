package sort;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = {-9,78,0,23,-567,70};
		quickSort(arr,0,arr.length-1);
		System.out.println(Arrays.toString(arr));
	}

	public static void quickSort(int[] arr,int left,int right) {
		int l = left;  // 左边的下标
		int r = right; // 右边的下标
		int pivot = arr[(left + right) / 2];  //中轴的值
		int temp = 0;
		//while 循环的目的，是让比pivot小的值放到左边，比pivot大的放到右边
		while(l < r) {
			//在pivot的左边一直找，找到大于或者等于pivot的值才退出循环
			while(arr[l] < pivot) {
				l += 1;
			}
			//在pivot的右边一直找，找到小于等于pivot的值才退出循环
			while(arr[r] > pivot) {
				r -= 1;
			}
			//如果l >= r 说明pivot左右两边的值已经是  左边全部小于等于pivot 右边全部大于等于pivot
			if(l >= r) {
				break;
			}
			
			//否则要进行交换
			temp = arr[l];
			arr[l] = arr[r];
			arr[r] = temp;
			
			//如果交换完之后，arr[l] == pivot 的值， 将r--，前移
			if(arr[l] == pivot) {
				r -= 1; 
			}
			
			//如果交换完之后，arr[r] == pivot 的值， 将l++，后移
			if(arr[r] == pivot) {
				l += 1;
			}
		}
		
		//如果l == r ，必须l++,r--,否则会出现栈溢出
		if(l == r) {
			l += 1;
			r -= 1;
		}
		
		//向左递归
		if(left < r) {
			quickSort(arr,left,r);
		}
		//向右递归
		if(right > l) {
			quickSort(arr,l,right);
		}
	}
}
