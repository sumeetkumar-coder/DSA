package com.sumeet.dsa.subSequence;

public class Solution50 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(String A) {

		int count = 0;
		int countA = 0;

		for (int i = 0; i < A.length(); i++) {

			if (A.charAt(i) == 'A') {
				countA++;

			}
			if (A.charAt(i) == 'G') {
				count = count + countA;
			}

		}

		return count;
	}

}
