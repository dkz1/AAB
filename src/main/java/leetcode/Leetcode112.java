package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 
 * @author 1 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *	思路：使用递归,每往下一层，就将sum变成sum-root.val， 一直判断到最后返回即可
 */
public class Leetcode112 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public boolean hasPathSum(TreeNode root, int sum) {
		if(root == null) {
			return false;
		}
		if(root.left == null && root.right == null) {
			return root.val == sum;
		}
		boolean b = false;
		if(hasPathSum(root.left,sum-root.val)) {
			b = true;
		}
		if(hasPathSum(root.right,sum-root.val)) {
			b = true;
		}
		return b;
	}
	
	//以下是非递归方法
	//使用两个队列，一个对树进行层序遍历，另一个记录每个路径的节点值的和
	
	public boolean hasPathSum2(TreeNode root,int sum) {
		if(root == null) {
			return false;
		}
		Queue<TreeNode> queNode = new LinkedList<>();
		Queue<Integer> queVal = new LinkedList<>();
		queNode.offer(root);
		queVal.offer(root.val);
		while(!queNode.isEmpty()) {
			TreeNode node = queNode.poll();
			int temp = queVal.poll();
			if(node.left == null && node.right == null) {
				if(temp == sum) {
					return true;
				}
				continue;
			}
			if(node.left != null) {
				queNode.offer(node.left);
				temp = temp + node.left.val;
				queVal.offer(temp);
			}
			if(node.right != null) {
				queNode.offer(node.right);
				temp = temp + node.right.val;
				queVal.offer(temp);
			}
		}
		return false;
	}
}
