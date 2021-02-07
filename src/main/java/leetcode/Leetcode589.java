package leetcode;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 
 * @author 1 给定一个 N 叉树，返回其节点值的前序遍历。
 * 
 *         思路：前序遍历，即先根节点，然后从左到右输出子节点，如果root为空，返回null，否则同二叉树的遍历一样，引入一个栈，先将根节点入栈
 *         然后栈不为空的条件下，用for循环遍历root的子节点，循环次数为children的size，每循环到一个子节点就将其入栈，必须从右到左入栈
 */
public class Leetcode589 {
	List<Integer> res = new ArrayList<>();

	class Node {
		public int val;
		public List<Node> children;

		public Node() {
		}

		public Node(int val) {
			this.val = val;
		}

		public Node(int val, List<Node> children) {
			this.val = val;
			this.children = children;
		}
	}

	// 前序遍历
	public List<Integer> preorder(Node root) {
		if (root != null) {
			return res;
		}
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			res.add(node.val);
			for (int i = node.children.size() - 1; i >= 0; i--) {
				stack.push(node.children.get(i));
			}
		}
		return res;
	}

	// 递归方法
	public List<Integer> preorder2(Node root) {
		preOrder(root);
		return res;
	}

	public void preOrder(Node root) {
		if (root == null) {
			return;
		}
		res.add(root.val);
		if (root.children == null) {
			return;
		}
		for (Node child : root.children) {
			preOrder(child);
		}
	}

	// 后序遍历
	// 思路：后序遍历想要输出的结果是 从左到右的节点然后根节点即 左右根，而前序遍历是输出根左右，将前序遍历时从右往左的子节点遍历循环，改成从左往右的即可得到根右左的List，逆序一下即可得到左右根
	public List<Integer> postorder(Node root) {
		if (root == null) {
			return null;
		}
		Stack<Node> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			Node node = stack.pop();
			res.add(node.val);
			for (int i = 0; i <node.children.size(); i++) {
				stack.push(node.children.get(i));
			}
		}
		List<Integer> postres = new ArrayList<>();
		for(int i = res.size()-1;i >= 0;i--) {
			postres.add(res.get(i));
		}
		return postres;
	}
}
