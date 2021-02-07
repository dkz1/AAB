package sort;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {
		int[] arr = {8,4,5,7,1,3,6,2};
		int[] temp = new int[arr.length];
		mergeSort(arr,0,arr.length-1,temp);
		System.out.println(Arrays.toString(arr));
	}

	//分+合的方法
	public static void mergeSort(int[] arr,int left,int right,int[] temp) {
		if(left < right) {
			int mid = (left + right) / 2; //中间索引
			//向左递归进行分解
			mergeSort(arr,left,mid,temp);
			//向右递归分解
			mergeSort(arr,mid+1,right,temp);
			//合并时，每次的分解都合并一次
			merge(arr,left,mid,right,temp);
		}
	}
	
	//合并的方法
	
	/**
	 * 
	 * @param arr 待排序的数组
	 * @param left 左边的有序序列的初始索引
	 * @param mid 中间索引
	 * @param right 右边索引
	 * @param temp 中转的辅助数组
	 */
	public static void merge(int[] arr,int left,int mid,int right,int[] temp) {
		int i = left; //初始化i  表示左边有序序列的第一个索引
		int j = mid + 1; // 初始化j  表示右边有序序列的初始索引
		int t = 0;  //指向temp数组的当前索引
		
		//1.先把左右两边（有序）的数据 按照规则填充到temp中，直到左右两边的有序序列有一边处理完毕
		while(i <= mid && j <= right) {
			//如果左边序列的当前元素，小于等于右边有序序列的当前元素，则把左边的当前元素填入temp当前位置，然后t和i均后移
			if(arr[i] <= arr[j]) {
				temp[t] = arr[i];
				t++;
				i++;
			}else {//否则将右边的当前元素填入temp,t,j后移
				temp[t] = arr[j];
				t++;
				j++;
			}
		}
		
		//2.把有剩余数据的一边的数据，依次填充到temp中
		while(i <= mid) { //说明左边的有序序列还有剩余元素，需要全部填入temp
			temp[t] = arr[i];
			t++;
			i++;
		}
		
		while(j <= right) {//右边元素有剩余的情况
			temp[t] = arr[j];
			t++;
			j++;
		}
		
		//3.将temp的数据拷贝到原数组
		//并不是每一次都拷贝所有数据
		t = 0;
		int tempLeft = left;
		while(tempLeft <= right) {
			arr[tempLeft] = temp[t];
			t++;
			tempLeft++;
		}
	}
}
