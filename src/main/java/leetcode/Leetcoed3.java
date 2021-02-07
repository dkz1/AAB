package leetcode;

import java.util.HashMap;
import java.util.Map;

/**
 * 给定一个整数数组 nums 和一个整数目标值 target，请你在该数组中找出和为目标值的那两个整数，并返回它们的数组下标。
 * 你可以假设每种输入只会对应一个答案。但是，数组中同一个元素不能使用两遍。
 * 你可以按任意顺序返回答案。
 * 示例
 * 输入：nums = [2,7,11,15], target = 9
 * 输出：[0,1]
 * 解释：因为 nums[0] + nums[1] == 9 ，返回 [0, 1] 。
 * 
 */
public class Leetcoed3 {
	public int[] twosum(int[] nums,int target){
		for(int i = 0;i < nums.length;i++) {
			for(int j = i+1;j < nums.length;j++) {
				if((nums[i] + nums[j]) == target) {
					int[] result = new int[]{i,j};
					return result;
				}
			}
		}
		return new int[0];
	}
	
	//方法2 使用HashMap，降低复杂度
	public int[] twosum2(int[] nums,int target) {
		Map<Integer,Integer> nummap = new HashMap<Integer,Integer>();
		for(int i = 0; i < nums.length;i++) {
			if(nummap.containsKey(target-nums[i])) {
				return new int[] {nummap.get(target - nums[i]),i};
			}
			nummap.put(nums[i], i);
		}
		return new int[0];
	}
}
