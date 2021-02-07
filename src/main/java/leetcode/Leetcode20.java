package leetcode;

import java.util.HashMap;
import java.util.Stack;

/**
 * 
 * @author 1
 *
 *         给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。 有效字符串需满足：
 *         1.左括号必须用相同类型的右括号闭合。 2.左括号必须以正确的顺序闭合。
 *
 *         注意:空字符串可被认为是有效字符串。
 *
 *         思路：
 *         遍历字符串的每一个字符，遇到左括号则放入一个栈中，遇到右括号则栈顶的字符出栈，与这个右括号进行匹配，如果能匹配，继续循环到最后一个字符
 *         如果不匹配则返回false，
 */
public class Leetcode20 {
	public static boolean isValid(String s) {
		// 先建立一个括号的对应关系的map
		HashMap<Character, Character> map = new HashMap<>();
		map.put('(', ')');
		map.put('[', ']');
		map.put('{', '}');
		Stack<Character> stack = new Stack<>();
		char[] ch = s.toCharArray();
		if ((s.length() % 2) != 0) {
			return false;
		}
		for (char c : ch) {
			if (c == '(' || c == '[' || c == '{') {
				stack.push(c);
			}
			if (c == ')' || c == ']' || c == '}') {
				if (!stack.isEmpty() && c == map.get(stack.peek())) {
					stack.pop();
				} else {
					return false;
				}
			}
		}
		return stack.isEmpty();
	}

	public static void main(String[] args) {
		System.out.println(isValid("[[[]"));
	}
}
