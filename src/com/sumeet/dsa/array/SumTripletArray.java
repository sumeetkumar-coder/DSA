package com.sumeet.dsa.array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/*
 * @Author Sumeet Kumar
 * 
 * Time complexity : O(n^2)
 * Space complexity : O(1)
 * 
 * */

public class SumTripletArray {

	public static void main(String[] args) {
		
		int[] arr = {-1,0,1,2,-1,-4};
		List<List<Integer>> l = threeSum(arr);
		System.out.println(l.toString());

	}

	public static  List<List<Integer>> threeSum(int[] nums) {

		Set<List<Integer>> list = new HashSet<List<Integer>>();

		if (nums.length < 3) {
			return new ArrayList<List<Integer>>();
		}

		Arrays.sort(nums);  // O(nlogn)

		for (int i = 0; i < nums.length - 2; i++) {

			int j = i + 1;
			int k = nums.length - 1;
			int sum = 0 - nums[i];

			while (j < k) {

				if (nums[j] + nums[k] == sum) {

					List<Integer> l = new ArrayList<Integer>();
					l.add(nums[i]);
					l.add(nums[j]);
					l.add(nums[k]);
					list.add(l);
					j++;

				} else if (nums[j] + nums[k] < sum) {
					j++;
				} else {
					k--;
				}

			}
		}

		return new ArrayList<List<Integer>>(list);
	}

}
