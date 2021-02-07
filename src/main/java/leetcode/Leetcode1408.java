package leetcode;

import java.util.ArrayList;
import java.util.List;

public class Leetcode1408 {
	
	public static void main(String[] args) {
		String[] words = {"mass","as","hero","superhero"};
		System.out.println(new Leetcode1408().stringMatching(words));
	}
	
	/**
	 * 给你一个字符串数组 words ，数组中的每个字符串都可以看作是一个单词。请你按任意顺序返回 words 中是其他单词的子字符串的所有单词。
	 * 如果你可以删除 words[j] 最左侧和/或最右侧的若干字符得到 word[i] ，那么字符串 words[i] 就是 words[j] 的一个子字符串。
	 * 
	 * 输入：words = ["mass","as","hero","superhero"]
	 * 输出：["as","hero"]
	 * 解释："as" 是 "mass" 的子字符串，"hero" 是 "superhero" 的子字符串。
	 * ["hero","as"] 也是有效的答案。
	 * @param words
	 * @return
	 */
	public List<String> stringMatching(String[] words) {
		//用kmpMatch遍历words，一个一个判断是否能找到母字符串，如果能找到，则将此串加入要返回的list
		List<String> list = new ArrayList<String>();
		for(int i = 0; i < words.length;i++) {
			for(int j = 0; j < words.length;j++) {
				if(words[i].length() < words[j].length()) {
					if(kmpMatch(words[j],words[i])) {
						list.add(words[i]);
						break;
					}
				}
			}
		}
		return list;
    }
	
	//写一个方法判断两个字符串是否有一个是另一个的子字符串
	/**
	 * kmp算法判断
	 * @param str1 较长字符串
	 * @param str2 较短字符串
	 * @return  如果短字符串是长字符串的子串返回true 否则返回false
	 */
	public boolean kmpMatch(String str1,String str2) {
		//先写出str2的最长公共前后缀表next
		int[] next = new int[str2.length()];
		next[0] = 0;
		for(int i = 1, j = 0; i < str2.length();i++) {
			while(j > 0 && str2.charAt(i) != str2.charAt(j)) {
				j = next[j-1];
			}
			
			if(str2.charAt(i) == str2.charAt(j)) {
				j++;
			}
			next[i] = j;
		}
		
		//以str1为目标进行循环，判断str2是否是str1的子串
		for(int i = 0, j = 0; i < str1.length();i++) {
			
			while(j > 0 && str1.charAt(i) != str2.charAt(j)) {
				j = next[j-1];
			}
			if(str1.charAt(i) == str2.charAt(j)) {
				j++;
			}
			if(j == str2.length()) {
				return true;
			}
		}
		return false;
	}
}
