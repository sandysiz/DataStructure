package com.java.arrays;

import java.util.Arrays;

//Given an array of integers, return indices of the two numbers such that they add up to a specific target.
//
//You may assume that each input would have exactly one solution, and you may not use the same element twice.
//
//Example:
//
//Given nums = [2, 7, 11, 15], target = 9,
//
//Because nums[0] + nums[1] = 2 + 7 = 9,
//return [0, 1].

public class TwoSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums = {2, 7, 11, 15};
		int target = 9;
      System.out.println(Arrays.toString(new TwoSum().twoSum(nums, target)));
	}
	
	public int[] twoSum(int[] nums, int target) {
		int[] finalArr = new int[2];
		for (int i = 0; i <= nums.length - 1; i++) {
			for (int j = 0; j <= nums.length - 1; j++) {
				if (nums[i] + nums[j] == target) {
					finalArr[0] = j;
					finalArr[1] = i;
					break;
				}
			}
		}
		return finalArr;
    }    

}
