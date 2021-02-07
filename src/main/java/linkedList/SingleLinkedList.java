package linkedList;

public class SingleLinkedList {
	// 先初始化一个头节点，头节点不动,不存放数据
	private Node head = new Node(0,null);
	
	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	// 添加节点到单链表
	// 1.不考虑编号顺序时，找到当前链表的最后一个节点，将最后这个节点的next指向新的节点
	public void add(Node node) {
		// head节点不能动，我们新建一个辅助节点
		Node temp = head;
		// 遍历链表，找到链表的最后
		while (temp.next != null) {  // 找到链表的最后的条件
			// 如果没有找到，将temp后移
			temp = temp.next;
		}
		// 当退出while循环时，temp指向链表的最后
		temp.next = node;
	}

	// 2.有编号时，考虑编号顺序，按编号顺序添加到指定位置，如果这个序号已经有了，添加失败并给出信息
	public void addorderly(Node node) {
		// 创建一个temp辅助节点，且temp位于添加位置的前一位，否则插入不了
		Node temp = head;
		boolean b = false; // 用于表示添加的编号是否存在，默认false
		while (temp.next != null) {
			if (temp.next.num > node.num) { // 找到了正确的位置，即当node.num第一次比temp.next小时
				break;
			} else if (temp.next.num == node.num) { // 要添加的编号已经存在了
				b = true;
				break;
			}
			temp = temp.next;
		}
		if (b) {
			System.out.println("此编号以存在，不可加入");
		} else {
			node.next = temp.next; // 新节点的next变成了原先temp的后一个节点
			temp.next = node; // temp的next节点如今变成了新节点
		}
	}

	// 修改节点信息，根据num编号来修改，即num编号不能改
	public void update(Node newNode) {
		if (newNode.next == null) {
			System.out.println("链表为空");
			return;
		}
		// 找到需要修改的节点，根据编号
		// 先定义一个辅助节点
		Node temp = head.next;
		boolean b = false; // 表示是否找到此节点
		while (temp != null) {
			if (temp.num == newNode.num) { // 找到要修改的节点了
				b = true;
				break;
			}
		}
		if (b) {
			temp.data = newNode.data;
		} else {
			System.out.println("没有找到此编号的节点");
		}
	}

	// 显示链表(同样是通过辅助变量遍历显示)
	public void list() {
		// 先判断链表是否为空
		if (head.next == null) {
			System.out.println("链表为空");
			return;
		}
		// 同样，头节点不动，创建一个辅助变量
		Node temp = head.next;
		while (temp != null) {
			// 输出节点信息
			System.out.println(temp);
			// 将temp后移
			temp = temp.next;
		}
	}

	// 删除节点
	// 同样，需要创建一个temp节点，指向要删除节点的前一个节点
	// 进行一步 temp.next = temp.next.next 即可把要删除的这个节点删除，此节点被java垃圾回收机制自动回收
	public void delNode(Node node) {
		Node temp = head;
		boolean b = false; // 表示是否找到待删除节点的前一个节点
		while (temp.next != null) {
			if (temp.next.num == node.num) {
				b = true;
				break;
			}
			temp = temp.next;
		}
		if (b) {
			temp.next = temp.next.next;
		} else {
			System.out.println("没有这个节点");
		}
	}

	// 查找某个编号的节点
	public void searchNode(Node node) {
		if (head.next == null) {
			System.out.println("链表为空");
			return;
		}
		Node temp = head.next;
		boolean b = false;
		while (temp != null) {
			if (temp.num == node.num) {
				b = true;
				break;
			}
			temp = temp.next;
		}
		if (b) {
			System.out.println(temp);
		} else {
			System.out.println("没有找到此节点");
		}
	}
	
	/**获取单链表有效节点的个数
	 * 如果是带头节点的，头节点不统计
	 * head是链表的头节点
	 * return的是链表的有效节点的个数
	 */

	public static int getLength(Node head) {
		if (head.next == null) {
			return 0;
		}
		int length = 0;
		// 定义一个辅助变量
		Node cur = head.next;
		while (cur != null) {
			length++;
			cur = cur.next;
		}
		return length;
	}
	
	/**
	 * 查找一个单链表中倒数第k个节点：
	 * 思路
	 * 1）编写一个方法，接收head节点，同时接收一个index，index表示倒数第index个节点
	 * 2）先把链表从头到尾遍历，得到链表的总长度
	 * 3）得到链表长度size后，从链表第一个开始遍历，遍历（size - index）个即可
	 * @param head
	 * @param index
	 * @return
	 */
	
	public static Node findLastIndexNode(Node head, int index) {
		if (head.next == null) {
			return null;
		}
		// 第一次遍历得到链表节点个数，即长度
		// 直接调用上面的getLength(head)方法即可
		int size = getLength(head);
		// 第二次遍历size - index次，得到倒数第index个节点
		// 先进行index的校验，index不能小于等于0或者大于size
		if (index <= 0 || index > size) {
			return null;
		}
		// 定义一个辅助变量
		Node cur = head.next;
		for (int i = 0; i < (size - index); i++) {
			cur = cur.next;
		}
		return cur;
	}
	
	/**
	 * 将单链表反转
	 * @author 1
	 *
	 */
	
	public static void reverseList(Node head) {
		if(head.next == null || head.next.next == null) {
			return;
		}
		//定义一个辅助变量
		Node cur = head.next;
		Node next = null; //指向当前节点cur的下一个节点
		Node reverseHead = new Node(0,null);
		//遍历原来的链表，每遍历一个节点，就将其取出，放在新链表reverseHead的最前端
		while(cur != null) {
			next = cur.next;   //保存目前的cur.next，因为后面需要用，而cur.next后面会有改变
			cur.next = reverseHead.next;  //将cur.next 指向reverseHead.next
			reverseHead.next = cur;//将reverseHead.next指向cur,至此就把遍历原始链表中得到的每一个元素cur往新链表的头部插入
			cur = next;//cur 后移 继续遍历
		}
		head.next = reverseHead.next;
	}

	// 定义一个Node类，每个Node对象就是一个节点
	public static class Node {
		private int num;
		private String data; // 数据
		private Node next; // 指向下一个节点

		public Node(String data) {
			super();
			this.data = data;
		}

		public Node(int num, String data) {
			super();
			this.num = num;
			this.data = data;
		}

		@Override
		public String toString() {
			return "Node [num=" + num + ", data=" + data + "]";
		}

	}
}
