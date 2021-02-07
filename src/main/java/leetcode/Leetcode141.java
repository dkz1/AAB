package leetcode;

/**
 * 
 * @author 1
 * 给定一个链表，判断链表中是否有环。
 * 
 * 如果链表中有某个节点，可以通过连续跟踪 next 指针再次到达，则链表中存在环。 
 * 为了表示给定链表中的环，我们使用整数 pos 来表示链表尾连接到链表中的位置（索引从 0 开始）。 
 * 如果 pos 是 -1，则在该链表中没有环。
 * 注意：pos 不作为参数进行传递，仅仅是为了标识链表的实际情况。
 * 	   如果链表中存在环，则返回 true 。 否则，返回 false 。
 * 
 *	   思路：从头开始遍历链表，每遍历到一个都将这个节点存入一个map，key即是pos，初始化为0，
 *	   当循环到某一节点时，发现map里已经有一个value节点和这个节点相同	，则有环。
 *
 *	   这种方法并不好，效率低，占用高
 *	   这类判断环的问题，最常用快慢指针的方法解决：
 *	   思路：创建一个每次走一步的辅助节点slow，slow = head再创建一个每次走两步的辅助节点fast,fast = head.next,
 *	   两个指针一起遍历链表，如果两个指针能够相遇，则证明链表有环，否则没有
 *	   
 */
public class Leetcode141 {
	class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
			next = null;
		}
	}

	public boolean hasCycle(ListNode head) {
		if(head == null || head.next == null) {
			return false;
		}
		ListNode slow = head;
		ListNode fast = head.next;
		while (slow != fast) {
			if(fast == null || fast.next == null) {
				return false;
			}
			slow = slow.next;
			fast = fast.next.next;
		}
		return true;
		//下面是我自己的方法，通过了测试
//		HashMap<Integer,ListNode> map = new HashMap<Integer, ListNode>();
//		int pos = 0;
//		while(head != null) {
//			if(map.containsValue(head)) {
//				return true;
//			}
//			map.put(pos, head);
//			head = head.next;
//			pos++;
//		}
//		return false;
	}
}
