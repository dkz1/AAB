package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author 1
 * 给定一个二叉树，检查它是否是镜像对称的。
 * 
 * 运用递归和迭代两种方法解决这个问题
 * 
 * 思路：对称的条件是 首先左子树的root和右子树的root要相等，即 root.left.val == root.right.val
 *左子树的左子节点 = 右子树的右子节点  即root.left.left.val == root.right.right.val
 *左子树的右子节点 = 右子树的左子节点 即 root.left.right.val == root.right.left.val
 *            
 *   
 */
public class Leetcode101 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}
	
	//需要一个辅助方法，判断两个子树是否对称
	public boolean isSymmetric2(TreeNode left,TreeNode right) {
		if(left == null && right == null) {
			return true;
		}
		if(left == null|| right == null) {
			return false;
		}
		boolean b = false;
		if(left.val == right.val && isSymmetric2(left.left,right.right) && isSymmetric2(left.right,right.left)) {
			b = true;
		}
		return b;
	}
	
	public boolean isSymmetric(TreeNode root) {
        if(root == null) {
        	return true;
        }
        return isSymmetric2(root.left,root.right);
    }
	
	//迭代方法： 使用队列
	public boolean isSymmetricbyQueue(TreeNode root) {
		if(root == null) {
			return true;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root.left);
		queue.offer(root.right);
		while(!queue.isEmpty()) {
			TreeNode node1 = queue.poll();
			TreeNode node2 = queue.poll();					//每次拿出两个元素进行比较
			if(node1 == null && node2 == null) {
				continue;
			}
			if(node1 == null || node2 == null || node1.val != node2.val) {
				return false;
			}
			queue.offer(node1.left);
			queue.offer(node2.right);
			
			queue.offer(node1.right);
			queue.offer(node2.left);                      //每次一组相对应的元素入队列，方便之后拿出来进行比较
		}
		return true;
	}
}
