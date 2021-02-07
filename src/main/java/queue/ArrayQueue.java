package queue;

public class ArrayQueue {
	private int maxSize; // 表示队列最大容量
	private int front; // 队列头部
	private int rear; // 队列尾部
	private int[] arr; // 该数组用于存放数据，模拟队列

//创建队列的构造器
	public ArrayQueue(int arrMaxSize) {
		maxSize = arrMaxSize;
		arr = new int[maxSize];
		front = -1; // front是指向队列头的前一个数据
		rear = -1; // rear是指向队列尾的数据，即最后一个
	}

//判断队列是否已满
	public boolean isFull() {
		return rear == maxSize - 1;
	}

//判断队列是否为空
	public boolean isEmpty() {
		return rear == front;
	}

//添加数据到队列
	public void addQueue(int n){
        //判断队列是否满
        if(isFull()){
            System.out.println("队列已满");
            return;
    }
    rear++;    //rear后移
    arr[rear] = n;
}

//获取队列数据，出队列，front+1
	public int getQueue() {
		// 判断队列是否为空
		if (isEmpty()) {
			// 通过抛出异常来处理
			throw new RuntimeException("队列为空");
		}
		front++; // front后移
		return arr[front];
	}

//显示队列的所有数据
	public void showQeue() {
		// 遍历
		if (isEmpty()) {
			System.out.println("队列中没有数据");
			return;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}

//显示队列头的数据，但不是取出数据
	public int headQueue() {
		// 判断是否为空
		if (isEmpty()) {
			throw new RuntimeException("队列为空");
		}
		return arr[front + 1];
	}
}
