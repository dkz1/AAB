package leetcode;

/**
 * 
 * @author 1
 *	编写一个函数来查找字符串数组中的最长公共前缀。
 *	如果不存在公共前缀，返回空字符串 ""。
 *
 *	示例 1:
 *	输入: ["flower","flow","flight"]
 *	输出: "fl"
 *
 *	示例 2:
 *	输入: ["dog","racecar","car"]
 *	输出: ""
 *	解释: 输入不存在公共前缀
 *
 *	说明:
 *	所有输入只包含小写字母 a-z 。
 *
 *	思路:
 *	以第一个字符串为模板即modelString，判断字符串数组的每个元素是不是以modelString为开头
 *	如果是则直接返回modelString，不是则将modelString的长度减一之后再进行判断
 * 	直到结果为真，最后输出结果
 *	
 */
public class Leetcode14 {
	public static String longestCommonPrefix(String[] strs) {
		if(strs.length == 0|| strs== null){
            return "";
        }
		if(strs.length == 1) {
			return strs[0];
		}
		String modelString = strs[0];
		String result =new String();
		for(int j = 0;j<strs.length;j++) {
			if (modelString == "") {
				result = modelString;
			}
			while(!strs[j].startsWith(modelString)) {
				modelString = modelString.substring(0, modelString.length()-1);
			}
			result = modelString;
		}
		return result;
	}
}
