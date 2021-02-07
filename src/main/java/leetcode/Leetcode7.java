package leetcode;

/**
 * 
 * @author 1
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 * 示例 1:
 * 输入: 123
 * 输出: 321
 * 注意:
 * 假设我们的环境只能存储得下 32 位的有符号整数，则其数值范围为 [−2的31次方,  2的31次方 − 1]。请根据这个假设，如果反转后整数溢出那么就返回 0。
 */
public class Leetcode7 {
	public static int reverse(int x) {
		char[] c = String.valueOf(x).toCharArray();
		StringBuilder sb = new StringBuilder();
		String s = new String();
		if(x<0) {
			for(int i = c.length-1; i > 0; i--) {
				sb.append(c[i]);
			}
			sb.insert(0, '-');
			s = sb.toString();
		}else {
			for(int i = c.length-1; i >= 0; i--) {
				sb.append(c[i]);
			}
			s = sb.toString();
		}
		Long y = Long.parseLong(s);
		if(y < Math.pow(-2, 31) || y > (Math.pow(2, 31)-1) ){
			return 0;
		}else {
			return y.intValue();
		}
	}
	
	//上面的方法用到的函数太多了，有更简洁，只用到数学计算的方法如下（Integer的取值在-2147483648~2147483647）
	public static int reverse2(int x) {
		int rev = 0;
		while(x != 0) {
			int pop = x % 10;   //pop是当前循环中x的最后一位数
			//到rev达到9位数时就需要判断得到的rev会不会溢出了
			//当rev>Integer.MAX_VALUE/10或者(rev==Integer.MAX_VALUE/10且pop（尾数）大于7)时，溢出，返回0
			if(rev > Integer.MAX_VALUE/10 || (rev == Integer.MAX_VALUE/10 && pop>7)) {
				return 0;
			}
			//当rev<Integer.MIN_VALUE/10或者rev==Integer.MIN_VALUE/10且pop小于-8时，溢出，返回0
			if(rev < Integer.MIN_VALUE/10 || (rev == Integer.MIN_VALUE/10 && pop < -8)) {
				return 0;
			}
			rev = rev*10 + pop;  //第一次循环是0*10+pop 即得到rev = 转换后的第一位数 以此类推 
			x = x/10;            // 下一次循环的x是上一次的x/10之后的数
		}
		return rev;
	}
	
	public static void main(String[] args) {
		System.out.println(reverse2(-757123));
	}
}
