package dkz;

import java.util.Scanner;

//  让用户输入语文，英语，数学成绩，如果总分小于180分，则输出：由于你的优秀，我想和你家长聊聊。
//  否则输出：同九义，何汝秀
//  满足不同的条件输出不同的内容，只能输出一种
//  总分<180  输出：叫家长
//  总分>=180并且语数外分数都大于98分  输出：恭喜升任五道杠大队长
//  总分>=180但是做不了五道杠的情况下如果语数外分数都大于95分  输出：恭喜升任班长
//  总分>=180但是既做不了五道杠也做不了班长的情况下  输出：同九义，何汝秀
public class Score {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		System.out.println("输入语文成绩：");
		int chinese = in.nextInt();
		System.out.println("输入英语成绩：");
		int english = in.nextInt();
		System.out.println("输入数学成绩：");
		int math = in.nextInt();
		int total = chinese+english+math;
		if(total < 180) {
			System.out.println("叫家长");
		}
		else if(total >= 180 && chinese > 98 && english > 98 && math > 98){
			System.out.println("恭喜升任五道杠大队长");
		}
		else if(total >= 180 && chinese > 95 && english > 95 && math > 95) {
			System.out.println("恭喜升任班长");
		}
		else {
			System.out.println("同九义，何汝秀");
		}
	}
	
}
