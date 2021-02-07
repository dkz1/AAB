package leetcode;

import java.util.Stack;

/**
 * 
 * @author 1
 * 设计一个支持 push ，pop ，top 操作，并能在常数时间内检索到最小元素的栈。
 * 
 * push(x) —— 将元素 x 推入栈中。
 * pop() —— 删除栈顶的元素。
 * top() —— 获取栈顶元素。
 * getMin() —— 检索栈中的最小元素。
 * 
 * pop、top 和 getMin 操作总是在 非空栈 上调用。
 * 思路： 定义一个MINnum用于保存最小值，每次压入元素和弹出元素时都进行更新即可
 * 
 * 第二种方法，用到一个辅助栈，每次压入元素时，原栈直接压入即可，辅助栈在压入时判断此元素和原栈顶相比哪个小，小则压入辅助栈，否则不压入
 * 	                  原栈弹出元素时，如果弹出的元素等于辅助栈的栈顶，则辅助栈也弹出，否则不弹出。
 */
public class Leetcode155 {
	class MinStack {
		Stack<Integer> minStack; //辅助栈
		Stack<Integer> stack;	 //原始栈
	    public MinStack() {
	    	minStack = new Stack<>();
	    	stack = new Stack<>();
	    }
	    
	    public void push(int x) {
	    	stack.push(x);
	    	if(minStack.isEmpty() || x <= minStack.peek()) {
	    		minStack.push(x);
	    	}
	    }
	    
	    public void pop() {
	    	if(stack.pop().equals(minStack.peek())) {
	    		minStack.pop();
	    	}
	    }
	    
	    public int top() {
	    	return stack.peek();
	    }
	    
	    public int getMin() {
	    	return minStack.peek();
	    }
	}
//	class MinStack {
//		Stack<Integer> minStack;
//		int MINnum;
//	    public MinStack() {
//	    	minStack = new Stack<>();
//	    	MINnum = Integer.MAX_VALUE;
//	    }
//	    
//	    public void push(int x) {
//	    	if(x <= MINnum) {
//	    		minStack.push(MINnum);
//	    		MINnum = x;
//	    	}
//	    	minStack.push(x);
//	    }
//	    
//	    public void pop() {
//	    	if(minStack.pop() == MINnum) {
//	    		MINnum = minStack.pop();
//	    	}
//	    }
//	    
//	    public int top() {
//	    	return minStack.peek();
//	    }
//	    
//	    public int getMin() {
//	    	return MINnum;
//	    }
//	}
}