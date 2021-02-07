package leetcode;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 
 * @author 1 给定一个 N 叉树，找到其最大深度。 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。 N
 *         叉树输入按层序遍历序列化表示，每组子节点由空值分隔
 *         思路：
 *         对给的树进行层序遍历，并且将每层的输出分别存入一个list，再用一个list存放每一层的list，这样得到大list的size就是最大深度
 *
 */
public class Leetcode559 {
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

	public int maxDepth(Node root) {
		if(root == null) {
			return 0;
		}
		List<List<Integer>> level = new LinkedList<>();
		Queue<Node> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Integer> eachlevel = new LinkedList<>();
			while(size > 0) {
				Node node = queue.poll();
				eachlevel.add(node.val);
				for(int i = 0;i<node.children.size();i++) {
					queue.offer(node.children.get(i));
				}
				size--;
			}
			level.add(eachlevel);
		}
		return level.size();
	}
}
