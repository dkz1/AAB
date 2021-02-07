package leetcode;

/**
 * 
 * @author 1
 * 给定一个二叉树，找出其最大深度。
 * 
 * 二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
 *
 */
public class Leetcode104 {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode() {
		}

		TreeNode(int val) {
			this.val = val;
		}

		TreeNode(int val, TreeNode left, TreeNode right) {
			this.val = val;
			this.left = left;
			this.right = right;
		}
	}

	public int maxDepth(TreeNode root) {
		//递归方法,递归分别得到左边和右边的最大深度，其中的较大者+1即是此二叉树的最大深度
		if(root == null) {
			return 0;
		}else {
			int leftMax = maxDepth(root.left);
			int rightMax = maxDepth(root.right);
			return Math.max(leftMax, rightMax)+1;
		}
	}
	
}
