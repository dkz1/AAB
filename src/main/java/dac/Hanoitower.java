package dac;

public class Hanoitower {

	public static void main(String[] args) {

	}

	// 汉诺塔的移动方法 使用分治算法解决
	/**
	 * 
	 * @param num 盘的个数
	 * @param a   a柱
	 * @param b   b柱
	 * @param c   c柱
	 */
	public static void hanoiTower(int num, char a, char b, char c) {
		// 如果只有一个盘
		if (num == 1) {
			System.out.println("第一个盘" + a + "->" + c);
		} else {
			// 如果是2个以上的盘，总是可以把整体看作两个盘，一个最底下的，一个上面所有的
			// 1.先把上面的盘 从 a -> b 移动过程会借助c
			hanoiTower(num - 1, a, c, b);
			// 2.把最下面的盘从a到c
			System.out.println("第" + num + "个盘从" + a + "->" + c);
			//3.把b所有的盘移动到c,移动过程借助a
			hanoiTower(num-1, b, a, c);
		}
	}
}
