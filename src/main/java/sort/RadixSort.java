package sort;

public class RadixSort {

	public static void main(String[] args) {
		int[] arr = {53,3,542,748,14,214};
	}

	//基数排序
	public static void radixSort(int[] arr) {
		
		
		//1.先要得到数组中最大的数的位数
		int max = arr[0];  //假设第一个数就是最大的
		for(int i = 1; i < arr.length;i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		//再得到最大数的位数
		int maxLength = (max+"").length();
		
		//定义一个二维数组，表示10个桶，每个桶是一个一维数组
		//二维数组包含10个一维数组，为了防止在放入数的时候数据溢出，每一个桶的大小定位 arr.length
		//很明确，基数排序就是用空间换时间的一种经典算法
		int[][] bucket = new int[10][arr.length];
		
		//为了记录每个桶中存放了多少个数据，我们要定义一个一维数组来记录各个桶每次放入的数据的个数
		//bucketElementCounts[0] 就是bucket[0] 这个桶中放入的数据的个数
		int[] bucketElementCounts = new int[10];
		
		for(int i = 0,n = 1; i < maxLength;i++,n *= 10) {
			//第一次是对个位数进行处理，第二次十位，依次类推
			for(int j = 0; j < arr.length;j++) {
				//取出每个元素的对应位数
				int digitOfElement = arr[j] / n % 10;
				//放入对应的桶
				bucket[digitOfElement][bucketElementCounts[digitOfElement]] = arr[j];
				bucketElementCounts[digitOfElement]++;
			}
			//按照这个桶的顺序，依次取出数据，放入原来的数组
			int index = 0;
			//遍历每一个桶，将数据放入原数组
			for(int k = 0; k < bucketElementCounts.length;k++) {
				//如果桶中有数据，才放入到原数组
				if(bucketElementCounts[k] != 0) {
					//遍历第k个桶，将数据放入原数组
					for(int l = 0; l < bucketElementCounts.length;l++) {
						//取出元素放入原来的arr
						arr[index++] = bucket[k][l];
					}
				}
				
				//处理后，需要将每个bucketElementCounts[k] 重置为0
				bucketElementCounts[k] = 0;
			}
		}
	}
}
