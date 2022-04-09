package com.sumeet.dsa.hashing;

import java.util.HashSet;
import java.util.Set;

public class Solution32 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public int solve(int[] A, int B) {

		Set<Integer> s = new HashSet<>();
		int result = 0;

		for (int i = 0; i < A.length; i++) {
			int temp = A[i] ^ B;

			if (s.contains(temp)) {
				result++;
			}
			s.add(A[i]);
		}

		return result;

	}

}
