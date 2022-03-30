package com.sumeet.dsa.string;

import java.util.Arrays;

public class Solution22 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		longestCommonPrefix(new String[]{"abc","ab","xyzs"});
	}

	public static String longestCommonPrefix(String[] A) {

		int x = Arrays.stream(A).map(a -> a.length()).reduce(Integer.MAX_VALUE, Integer::min);
		System.out.println(x);
		return null;
	}

}
