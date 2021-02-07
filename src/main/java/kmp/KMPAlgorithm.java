package kmp;

public class KMPAlgorithm {

	public static void main(String[] args) {
		String str1 = "BBC ABCDAB ABCDABCDABDE";
		String str2 = "ABCDABD";
	}
	
	//kmp搜索算法
	/**
	 * 
	 * @param str1	原字符串
	 * @param str2	子串
	 * @param next	子串对应的部分匹配表
	 * @return	如果返回-1就是没有匹配，否则返回第一个匹配到的位置
	 */
	public static int kmpSearch(String str1,String str2,int[] next) {
		
		//以str1为目标遍历
		for(int i = 0,j = 0;i < str1.length(); i++) {
			//需要处理str1.charAt(i) != str2.charAt(j)的情况  核心点
			//调整j的大小
			while(j > 0 && str1.charAt(i) != str2.charAt(j)) {
				j = next[j-1];
			}
			
			if(str1.charAt(i) == str2.charAt(j)) {
				j++;
			}
			if(j == str2.length()) {
				return i - j + 1;
			}
		}
		return -1;
	}
	
	
	//获取到一个子串的 部分匹配值(即最长公共前后缀)
	public static int[] kmpNext(String dest) {
		//创建一个next数组，保存部分匹配值
		int[] next = new int[dest.length()];
		next[0] = 0;  //如果字符串长度为1 ，部分匹配值为0
		for(int i = 1,j = 0; i < dest.length(); i++) {
			//当dest.charAt(i) ！== dest.charAt(j)时，需要从next[j-1]获取新的j
			//直到发现条件满足时才退出
			while(j > 0 && dest.charAt(i) != dest.charAt(j)) {
				j = next[j-1];
			}
			
			if(dest.charAt(i) == dest.charAt(j)) {  //此条件满足时，部分匹配值就+1
				j++;
			}
			next[i] = j;
		}
		return next;
	}
}
