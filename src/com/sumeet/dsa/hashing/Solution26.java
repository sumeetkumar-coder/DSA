package com.sumeet.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

/*
 * Given an array A of N integers.

Find the largest continuous sequence in a array which sums to zero.
 * 
 */



public class Solution26 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	  public int[] lszero(int[] A) {

	        int[] prefix = new int[A.length+1];

	        Map<Integer, Integer> map = new HashMap<>();
	        map.put(0, 0);

	        int len = 0;
	        int startIndex = 0;
	        int endIndex = -1;

	        for (int i=1; i<= A.length; i++) {

	            int x = prefix[i-1] + A[i-1];
	             prefix[i] = x;

	            if (map.containsKey(x)) {
	               
	                if ((i - map.get(x)) > len) {
	                endIndex = i-1;
	                startIndex = map.get(x);
	                len = endIndex - startIndex + 1;
	                }
	               
	            } else {
	                map.put(x, i);
	            }
	        }

	         int[] res = new int[len];
	         int count = 0;
	        if (len != 0) {
	            for (int k=startIndex; k<=endIndex; k++) {
	                res[count] = A[k];
	                count++;
	            }
	        }

	        return res;

	       

	    }

}
