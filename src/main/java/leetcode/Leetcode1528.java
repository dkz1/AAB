package leetcode;

/**
 * 
 * @author 1
 * 给你一个字符串 s 和一个 长度相同 的整数数组 indices 。
 * 请你重新排列字符串 s ，其中第 i 个字符需要移动到 indices[i] 指示的位置。
 * 返回重新排列后的字符串。
 *
 */

public class Leetcode1528 {
	public String restoreString(String s, int[] indices) {
		char[] res = new char[s.length()];
		for(int i = 0;i < s.length();i++) {
			res[indices[i]] = s.charAt(i);
		}
		return String.valueOf(res);
	}
}
