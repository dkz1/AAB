package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * @author 1 给定一个二叉树，返回其节点值自底向上的层序遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *		思路：将二叉树进行正常的层序遍历，每一层的节点数值分别记录下来，然后逆序输出即可
 */
public class Leetcode107 {

	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;

		TreeNode(int x) {
			val = x;
		}
	}

	public List<List<Integer>> levelOrderBottom(TreeNode root) {
		List<List<Integer>> res = new ArrayList<>();
		if(root == null) {
			return res;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> list = new ArrayList<>();
			while(size > 0) {
				TreeNode node = queue.poll();
				list.add(node.val);
				if(node.left != null) {
					queue.add(node.left);
				}
				if(node.right != null) {
					queue.add(node.right);
				}
				size--;
			}
			res.add(list);
		}
		List<List<Integer>> finalres = new ArrayList<>();
		for(int i = res.size()-1; i >= 0;i--) {
			finalres.add(res.get(i));
		}
		return finalres;
	}
}
