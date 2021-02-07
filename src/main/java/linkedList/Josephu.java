package linkedList;

public class Josephu {
	//创建一个小孩节点类
	public class kidNode{
		int num;
		kidNode next;
		public kidNode(int num) {
			super();
			this.num = num;
		}
		public int getNum() {
			return num;
		}
		public void setNum(int num) {
			this.num = num;
		}
		
		
	}
	//先创建一个有n个节点单向环形链表类
	public class CircleSingleLinkedList{
		kidNode first = null;
		public void addkidNode(int n) {
			if(n < 1) {							//排除异常情况
				System.out.println("n的值不正确");
			}
			kidNode temp = null;
			for(int i = 1;i < n;i++) {			//循环添加
				kidNode kid = new kidNode(i);
				if(i == 1) {					//加入第一个时，情况特殊一点
					first = kid;
					first.next = first;			//单个元素成环
					temp = first;
				}else {
					temp.next = kid;
					kid.next = first;
					temp = kid;
				}
			}
		}
		public void showKid() {
			if(first == null) {
				System.out.println("链表为空");
				return;
			}
			kidNode temp = first;
			while(temp.next != first) {
				System.out.println("小孩的编号为"+temp.getNum());
				temp = temp.next;
			}
		}
	/**
	 * 
	 * @param n  一共有多少小孩
	 * @param k  从第几个小孩开始报数
	 * @param m  报数报到多少，此小孩出圈
	 */
	public void countKid(int n,int k,int m){
		if(first == null || k < 1 || k > n) {
			System.out.println("数据有误");
			return;
		}
		kidNode temp = first;
		while(temp.next != first) {
			temp = temp.next;
		}
		//开始之前，要让temp指向起始点的前一个，first指向起始点  即将first和temp都移动k-1次
		for(int i = 0;i <k-1;i++) {
			first = first.next;
			temp = temp.next;
		}
		//开始进行出圈循环，直到圈内只有一个人,报数时，temp和first要同时后移m-1次
		while(first.next != first) {
			for(int j = 0;j < m-1;j++) {
				first = first.next;
				temp = temp.next;
			}
			//此时first指向的就是要出圈的kid
			System.out.println("此时出圈的是小孩"+first.getNum());
			first = first.next;
			temp.next =first;
		}
		System.out.println("最后留在圈内的是小孩"+first.getNum());
	}
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
