package leetcode;

/**
 * 
 * @author 1
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 * 示例 :
 * 输入: 121
 * 输出: true
 * 
 * 输入: -121
 * 输出: false
 * 解释: 从左向右读, 为 -121 。 从右向左读, 为 121- 。因此它不是一个回文数。
 * 
 * 进阶:不将整数转为字符串来解决这个问题吗？
 *
 */
public class Leetcode9 {
	public static boolean isPalindrome(int x) {
		char[] c = String.valueOf(x).toCharArray();
		StringBuilder sb = new StringBuilder();
		for(int i = c.length-1; i >= 0; i--) {
			sb.append(c[i]);
		}
		String s = sb.toString();
		if(s.equals(String.valueOf(x))) {
			return true;
		}else {
			return false;
		}
	}
	//不将整数转换为字符串的方法
	public static boolean isPalindrome2(int x) {
		boolean b = false;
		if(x < 0) {
			b = false;
		}else {
			int y = 0;
			int temp = x;
			while(temp != 0) {
				int pop = temp % 10;
				y = y * 10 + pop;
				temp = temp/10;
			}
			if(y == x) {
				b = true;
			}
			else {
				b = false;
			}
		}
		return b;
	}

	public static void main(String[] args) {
		System.out.println(isPalindrome2(12321));
	}

}
