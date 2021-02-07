package leetcode;

/**
 * 
 * @author 1 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。 
 * 	   示例：输入: 1->1->2 输出: 1->2
 * 
 *         输入: 1->1->2->3->3 输出: 1->2->3
 *
 *         思路：遍历每一个元素，如果temp.val = temp.next.val,则temp.next = temp.next.next
 */
public class Leetcode83 {
	public ListNode deleteDuplicates(ListNode head) {
		ListNode temp = head;
		while(true) {
			if(temp == null || temp.next == null) {
				break;
			}
			if(temp.val == temp.next.val) {
				temp.next = temp.next.next;
			}else {
				temp = temp.next;
			}
		}
		return head;
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
}
