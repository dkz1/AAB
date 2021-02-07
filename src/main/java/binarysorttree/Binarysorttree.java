package binarysorttree;

import java.lang.annotation.Target;

public class Binarysorttree {
	
	private Node root;
	
	//查找要删除的节点
	public Node search(int value) {
		if(root == null) {
			return null;
		}else {
			return root.search(value);
		}
	}
	
	//查找父节点
	public Node searchParent(int value) {
		if(root == null) {
			return null;
		}else{
		return root.searchParent(value);
		}
	}
	/**
	 * 
	 * @param node 传入的节点，当作二叉排序树的根节点
	 * @return 返回的是 以node为root的 二叉排序树中最小节点的值    同时还要删除这个最小节点
	 */
	public int delRightTreeMin(Node node) {
		Node target = node;
		//循环查找左子节点，就会找到最小值(由于二叉排序树的性质，最小值一定在就是最左边的子节点)
		while(target != null) {
			target = target.left;
		}
		//此时target指向最小的节点
		delNode(target.value);
		return target.value;
	}
	
	//删除节点
	public void delNode(int value) {
		if(root == null) {
			return;
		}else {
			//先找到要删除的节点 targetNode
			Node targetNode = search(value);
			//如果没有找到要删除的节点
			if(targetNode == null) {
				return;
			}
			//如果这个二叉排序树只有一个节点
			if(root.left == null && root.right == null) {
				root = null;
				return;
			}
			//去找到targetNode的父节点
			Node parent = searchParent(value);
			//如果要删除的节点是叶子节点
			if(targetNode.left == null && targetNode.right == null) {
				//再判断targetNode是父节点的左子节点还是右子节点
				if(parent.left != null && parent.left.value == value) {
					parent.left = null;
				}else if(parent.right != null && parent.right.value == value) {
					parent.right = null;
				}
				//删除有两个子树的节点
			}else if(targetNode.left != null && targetNode.right != null) {
				int minval = delRightTreeMin(targetNode.right);
				targetNode.value = minval;
				//删除只有一颗子树的节点
			}else {
				//如果要删除的节点只有左子节点
				if(targetNode.left != null) {
					if(parent != null) {
						//如果targetNode是parent的左子节点
						if(parent.left.value == value) {
							parent.left = targetNode.left;
						}else {  //targetNode是parent的右子节点
							parent.right = targetNode.left;
						}
					}else {
						root = targetNode.left;
					}
				}else {  //要删除的节点只有右子节点
					if(parent != null) {
						//当targetNode是parent的左子节点
						if(parent.left.value == value) {
							parent.left = targetNode.right;
						}else {  //当targetNode是parent的右子节点
							parent.right = targetNode.right;
						}
					}else {
						root = targetNode.right;
					}
				}
			}
		}
	}
	
	
	//添加节点
	public void add(Node node) {
		if(root == null) {
			root = node;
		}else {
			root.add(node);
		}
	}
	
	//中序遍历方法
	public void inOrder() {
		if(root != null) {
			root.inOrder();
		}else {
			System.out.println("树为空，无法遍历");
		}
	}
	
	class Node{
		int value;
		Node left;
		Node right;
		
		public Node(int value) {
			super();
			this.value = value;
		}
		
		//查找要删除的节点
		/**
		 * 
		 * @param value 希望删除的节点的值
		 * @return 返回该节点
		 */
		public Node search(int value) {
			if(value == this.value) {  //找到该节点
				return this;
			}else if(value < this.value) { //想查找的值，小于当前节点值，应当向左子树继续查找
				if(this.left == null) {	//左子节点为空，就没有这个值 找不到
					return null;
				}
				return this.left.search(value);
			}else{
				if(this.right == null) {
					return null;
				}
				return this.right.search(value);
			}
		}
		
		//查找要删除节点的父节点的方法
		/**
		 * 
		 * @param value 要找的节点的值
		 * @return 返回要找的节点的父节点，如果没有返回null
		 */
		public Node searchParent(int value) {
			// 当前节点就是要找的节点的父节点
			if((this.left != null && this.left.value == value) || (this.right != null && this.right.value == value)) {
				return this;
			}else {
				//如果要找的值小于当前节点值且当前节点的左子节点不为空,向左子树递归查找,如果大于或等于，则递归向右子树查找
				if(value < this.value && this.left != null) {
					return this.left.searchParent(value);
				}else if(value >= this.value && this.right != null){
					return this.right.searchParent(value);
				}else {
					return null;
				}
			}
		}
		
		@Override
		public String toString() {
			return "Node [value=" + value + "]";
		}


		// 加入节点的方法
		public void add(Node node) {
			if(node == null) {
				return;
			}
			if(node.value < this.value) {
				if(node.left == null) {
					this.left = node;
				}else {
					this.left.add(node);
				}
			}else {
				if(node.right == null) {
					this.right = node;
				}else {
					this.right.add(node);
				}
			}
		}
		
		//中序遍历方法
		public void inOrder() {
			if(this.left != null) {
				this.left.inOrder();
			}
			System.out.println(this);
			if(this.right != null) {
				this.right.inOrder();
			}
		}
	}

}
