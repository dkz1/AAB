package tree;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class OrderTree {
	
	private TreeNode root;

	public void setRoot(TreeNode root) {
		this.root = root;
	}

	/**
	 * 创建树, 创建如上图中的树结构
	 */
	public void buildTree(String str) {  // "ABCD;BEF;CG;DH;EIJ"
		String[] s = str.split(";");
		TreeNode root = new TreeNode(s[0].charAt(0));
		setRoot(root); 
		List<TreeNode> allNodes = new LinkedList<>();    // ABCDEFGHIJ
		allNodes.add(root);
		List<List<TreeNode>> list = new LinkedList<>();  //[[BCD],[EF],[G],[H],[IJ]]
		for(int i = 0;i<s.length;i++) {
			List<TreeNode> nodes = new LinkedList<>(); 
			for(int j = 1;j<s[i].length();j++) {
				TreeNode node = new TreeNode(s[i].charAt(j));
				nodes.add(node);
				allNodes.add(node);
			}
			list.add(nodes);
		}
		for(int k = 0; k < s.length;k++) {
			allNodes.get(k).setChildren(list.get(k));
		}
	}

	/**
	 * 返回树的根节点
	 * 
	 * @return
	 */
	public TreeNode getRootTreeNode() {
		return root;
	}

	/**
	 * 深度优先遍历
	 */
	public void depthFirstSearch() {//前序遍历
		if(root == null) {
			return;
		}
		Stack<TreeNode> stack = new Stack<>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			System.out.print(node.getName());
			if(node.getChildren() != null) {
				for (int i = node.getChildren().size() - 1; i >= 0; i--) {
					stack.push(node.getChildren().get(i));
				}
			}
		}
	}

	/**
	 * 广度优先遍历
	 */
	public void breathFirstSearch() {
		if(root == null) {
			return;
		}
		Queue<TreeNode> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()) {
			TreeNode node = queue.poll();
			System.out.print(node.getName());
			if(node.getChildren() != null) {
				for(int i = 0; i<node.getChildren().size();i++) {
					queue.add(node.getChildren().get(i));
				}
			}
		}
	}

	/**
	 * 返回树的最大深度
	 * 
	 * @return
	 */
	public int getMaxDepth() {
		if(root == null) {
			return 0;
		}
		List<List<Character>> level = new LinkedList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<Character> eachlevel = new LinkedList<>();
			while(size > 0) {
				TreeNode node = queue.poll();
				eachlevel.add(node.getName());
				if(node.getChildren() != null) {
					for(int i = 0;i<node.getChildren().size();i++) {
						queue.offer(node.getChildren().get(i));
					}
				}
				size--;
			}
			level.add(eachlevel);
		}
		return level.size();
	}

	/**
	 * 返回某一层的节点个数
	 * 
	 * @param n
	 * @return
	 */
	public List<TreeNode> getLevelNodes(int n) {
		if(root == null) {
			return null;
		}
		List<List<TreeNode>> level = new LinkedList<>();
		Queue<TreeNode> queue = new LinkedList<>();
		queue.offer(root);
		while(!queue.isEmpty()) {
			int size = queue.size();
			List<TreeNode> eachlevel = new LinkedList<>();
			while(size > 0) {
				TreeNode node = queue.poll();
				eachlevel.add(node);
				if(node.getChildren() != null) {
					for(int i = 0;i<node.getChildren().size();i++) {
						queue.offer(node.getChildren().get(i));
					}
				}
				size--;
			}
			level.add(eachlevel);
		}
		return level.get(n-1);
	}
}

class TreeNode {

	private char name;
	private List<TreeNode> children;
	
	

	public TreeNode() {
		super();
	}

	public TreeNode(char name) {
		super();
		this.name = name;
	}

	public TreeNode(char name, List<TreeNode> children) {
		super();
		this.name = name;
		this.children = children;
	}

	public char getName() {
		return name;
	}

	public void setName(char name) {
		this.name = name;
	}

	
	public List<TreeNode> getChildren() {
		return children;
	}

	public void setChildren(List<TreeNode> children) {
		this.children = children;
	}

	
	@Override
	public String toString() {
		return "TreeNode [name=" + name + "]";
	}

	/**
	 * 返回直接子节点
	 * 
	 * @return
	 */
	public List<TreeNode> listChildren() {
		return this.children;
	}
}