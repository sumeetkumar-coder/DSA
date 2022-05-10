package com.sumeet.dsa.subSequence;

public class Solution49 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solve("bit","dfbkjijgbbiihbmmt"));

	}
	 public static String solve(String A, String B) {

	        int index = 0;

	        for (int i=0; i<B.length(); i++) {
	            if (A.charAt(index) == B.charAt(i)) {
	                index++;
	            }
	            if (index == A.length()) {
	            return "YES";
	            }
	        }

	        if (index == A.length()) {
	            return "YES";
	        }

	        return "NO";
	    }

}
