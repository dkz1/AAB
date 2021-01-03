package dkz;

import java.util.Random;

//    定义一个方法，该方法可以获取一个任意长度的随机字符串，字符串中的字符可能是英文大小写和数字
public class Fangfa7 {
	public static String radomString(int length) {
		Random r = new Random();
		char[] chars = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F','G','H',
				'I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b',
				'c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w',
				'x','y','z'};
		String str = "";
		for(int i = 0;i < length;i++) {
			int x = r.nextInt(chars.length);
			str = str + x;
		}
		return str;
	}
	public static void main(String[] args) {
		
	}

}
