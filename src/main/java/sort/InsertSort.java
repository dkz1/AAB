package sort;

public class InsertSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	
	public static void insertSort(int[] arr) {
		for(int i = 1; i < arr.length;i++) {
			int insertVal = arr[i];
			int insertIndex = i-1;
			//给insertVal找到插入的位置
			//1.insertIndex >= 0 保证在给insertVal找插入位置时不越界
			//2.insertVal < arr[insertIndex] 表示待插入的数还没有找到合适的位置
			//3/需要将arr[insertIndex] 后移
			while(insertIndex >= 0 && insertVal < arr[insertIndex]) {
				arr[insertIndex+1] = arr[insertIndex];
				insertIndex--;
			}
			arr[insertIndex+1] = insertVal;
		}
	}
}
