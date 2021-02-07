package queue;

/**
 * 数组模拟环形队列
 */
public class CircleArrayQueue {
	//第一步 编写一个ArrayQueue类
	    private int maxSize;  // 表示队列最大容量
	    private int front;    // 队列头部
	    private int rear;     // 队列尾部
	    private int[] arr;       //该数组用于存放数据，模拟队列

	//创建队列的构造器
	    public CircleArrayQueue(int arrMaxSize){
	        maxSize = arrMaxSize;
	        arr = new int[maxSize];
	        front = 0;
	        rear = 0;
	}

	//判断队列是否已满
	    public boolean isFull(){
	        return (rear+1) % maxSize == front;
	}

	//判断队列是否为空
	    public boolean isEmpty(){
	        return rear == front;
	}

	//添加数据到队列
	    public void addQueue(int n){
	        //判断队列是否满
	        if(isFull()){
	            System.out.println("队列已满");
	            return;
	    }
	    arr[rear] = n;  //直接加入数据
	    rear = (rear+1) % maxSize; //取模将rear后移
	}

	//获取队列数据，出队列，front+1
	    public int getQueue(){
	        //判断队列是否为空
	        if(isEmpty()){
	            //通过抛出异常来处理
	            throw new RuntimeException("队列为空");
	    }
	    //1.先把front对应的值保存到一个临时变量中
	    //2.将front后移,同样取模
	    //3.将临时变量返回
	        int value = arr[front];
	        front = (front + 1) % maxSize;
	        return value;
	}

	    //需要定义一个方法，求出当前队列有效数据的个数
	    public int size() {
	    	return (rear + maxSize - front) % maxSize;
	    }
	//显示队列的所有数据
	    public void showQueue(){
	        //遍历
	        if(isEmpty()){
	            System.out.println("队列中没有数据");
	            return;
	    }
	    for(int i = front;i < front+size();i++){
	        System.out.println(arr[i % maxSize]);
	    }
	}

	//显示队列头的数据，但不是取出数据
	public int headQueue(){
	    //判断是否为空
	    if(isEmpty()){
	        throw new RuntimeException("队列为空");
	    }
	    return arr[front];
	}
}
