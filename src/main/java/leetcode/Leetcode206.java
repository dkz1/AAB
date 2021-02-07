package leetcode;

/**
 * 
 * @author 1
 * 反转一个单链表。
 * 示例：
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 
 * 思路：将顺序的元素，一个一个的在链表头部插入 需要一个temp = head.next
 * 	   创建一个新的表头head2且head2.next = head
 *	   然后将后续元素一个一个插入head2和head之间
 *	   while(temp != null)
 *	   循环体  需要一个next来接收原链表的递增
 *	   next = temp.next
 *	   temp.next = head2.next
 *	   head2.next = temp
 *	   temp = next
 *
 */
public class Leetcode206 {
	public ListNode reverseList(ListNode head) {
		if(head == null || head.next == null) { //当head只有一个元素或者没有元素时，直接返回head
			return head;
		}
		ListNode temp = head.next;
		ListNode next = null;
		ListNode head2 = new ListNode(0);
		head2.next = head;
		head.next = null;
		while(temp != null) {
			next = temp.next;
			temp.next = head2.next;
			head2.next = temp;
			temp = next;           //因为temp在循环中会发生改变，所有需要一个next在开始记录下temp.next，一轮循环完之后
		}						   //再将temp重置并后移，保证进行原表的遍历
		return head2.next;	
	}
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode(int x) {
			val = x;
		}
	}
}
