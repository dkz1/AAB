package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Leetcode1370 {
	
	public static void main(String[] args) {
		String s = "spo";
		Leetcode1370 demo = new Leetcode1370();
		System.out.println(demo.sortString(s));
	}
	
	/**
	 * 给你一个字符串 s ，请你根据下面的算法重新构造字符串：
	 * 1.从 s 中选出 最小 的字符，将它 接在 结果字符串的后面。
	 * 2.从 s 剩余字符中选出 最小 的字符，且该字符比上一个添加的字符大，将它 接在 结果字符串后面。
	 * 3.重复步骤 2 ，直到你没法从 s 中选择字符。
	 * 4.从 s 中选出 最大 的字符，将它 接在 结果字符串的后面。
	 * 5.从 s 剩余字符中选出 最大 的字符，且该字符比上一个添加的字符小，将它 接在 结果字符串后面。
	 * 6.重复步骤 5 ，直到你没法从 s 中选择字符。
	 * 7.重复步骤 1 到 6 ，直到 s 中所有字符都已经被选过。
	 * 在任何一步中，如果最小或者最大字符不止一个 ，你可以选择其中任意一个，并将其添加到结果字符串。
	 * 
	 * 请你返回将 s 中字符重新排序后的 结果字符串 。
	 * @param s		s 只包含小写英文字母
	 * @return
	 */
	
	public String sortString(String s) {
		//将s变成一个可以删除元素的ArrayList
		List<Character> list = new ArrayList<Character>();
		//new一个结果字符串 用StringBuffer
		StringBuffer res = new StringBuffer();
		char[] ch = s.toCharArray();
		//将数组从小到大排序
		Arrays.sort(ch);
		for(char c : ch) {
			list.add(c);
		}
		while(list.size() > 0) {
			//第1步，选出最小的字符
			char min = list.get(0);
			//此时min就是最小的字符，添加到res中,同时原字符串中删除这个字符
			res.append(min);
			list.remove(0);
			//第2-3步,循环从s剩余字符中再次选取次小的字符
			while(list.size() > 0 && min < list.get(list.size()-1)) {//没有更大的字符可以选取了
				for(int i = 0; i < list.size(); i++) {
					if(list.get(i) > min) {
						min = list.get(i);
						list.remove(i);
						break;
					}
				}
				res.append(min);
			}
			//第4步，选出最大的字符，添加到res,在原字符串中删除此字符
			if(list.size() > 0) {
				char max = list.get(list.size()-1);
				res.append(max);
				list.remove(list.size()-1);
				//第5-6步，循环从s剩余字符中再次选取次大的字符
				while(list.size() > 0 && max > list.get(0)) {
					for(int i = list.size()-1; i >= 0; i--) {
						if(list.get(i) < max) {
							max = list.get(i);
							list.remove(i);
							break;
						}
					}
					res.append(max);
				}
			}
		}
		return res.toString();
    }
	
}
