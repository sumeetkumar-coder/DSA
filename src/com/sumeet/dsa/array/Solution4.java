package com.sumeet.dsa.array;

public class Solution4 {

	public static void main(String[] args) {
		
		System.out.println(titleToNumber("AB"));

	}
	
	 public static int titleToNumber(String A) {

	        char[] c = A.toCharArray();

	        int result = 0;

	        for (int i=c.length-1, j=0; i>=0; i--,j++) {

	            int x = (c[i] - 'A') + 1;
	            result = result + (int)(x*(Math.pow(26,j)));
	        }

	        return result;


	    }

}
