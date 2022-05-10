package com.sumeet.dsa.array;

public class Solution51 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int maxSubArray(final int[] A) {

		int max = Integer.MIN_VALUE;

		int sumPrefix = 0;

		for (int i = 0; i < A.length; i++) {

			sumPrefix = sumPrefix + A[i];

			if (sumPrefix > max) {
				max = sumPrefix;
			}
			if (sumPrefix < 0) {
				sumPrefix = 0;
			}

		}

		return max;

	}

}
