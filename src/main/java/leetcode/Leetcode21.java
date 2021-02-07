package leetcode;

/**
 * 
 * @author 1
 * 将两个升序链表合并为一个新的 升序 链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 * 示例：输入：l1 = [1,2,4], l2 = [1,3,4]
 *     输出：[1,1,2,3,4,4]
 *     
 *     输入：l1 = [], l2 = []
 *     输出：[]
 *     
 *     输入：l1 = [], l2 = [0]
 *     输出：[0]
 *     
 *     两个链表的节点数目范围是 [0, 50]
 *     -100 <= Node.val <= 100
 *     l1 和 l2 均按 非递减顺序 排列
 *
 *    思路：建立一个新的链表temp，  将l1 l2 逐个比较，小的一个直接连接到temp上，循环连接即可得到最终目标链表
 */

public class Leetcode21 {
	public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode temp = new ListNode(0);
		ListNode result = new ListNode(0);   //因为后续temp一直在变动，需要一个节点将temp每次的得到的结果连接起来
			result = temp;
			if(l1 == null) {
				temp.next = l2;
			}
			if(l2 == null) {                 //两种特殊情况，l1或者l1为空，直接返回另一个链表
				temp.next = l1;
			}
		while(l1 != null && l2 != null) {		//当l1 和 l2 都不为空时，逐个进行比较，将较小的先加入到链表temp的next上
			if(l1.val <= l2.val) {
				temp.next = l1;
				l1 = l1.next;
			}else {
				temp.next = l2;
				l2 = l2.next;
			}
			temp = temp.next;
			while(l1 == null && l2 != null) {    //其中一个链表中的元素已经比较完了，直接将另一个链表加入到后面即可
				temp.next = l2;
				l2 = l2.next;
				temp = temp.next;
			}
			while(l1 != null && l2 == null) {
				temp.next = l1;
				l1= l1.next;
				temp = temp.next;
			}
		}
		return result.next;
	}
	
	public class ListNode {
		int val;
		ListNode next;

		ListNode() {
		}

		ListNode(int val) {
			this.val = val;
		}

		ListNode(int val, ListNode next) {
			this.val = val;
			this.next = next;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	}

}
