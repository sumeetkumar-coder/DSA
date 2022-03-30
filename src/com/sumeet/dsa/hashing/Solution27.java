package com.sumeet.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class Solution27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int solve(int[] A) {

	        int min = Integer.MAX_VALUE;
	        Map<Integer,Integer> hm = new HashMap<>();
	        boolean present = false;

	        for (int i=0; i<A.length; i++) {

	            if (hm.containsKey(A[i])) {
	                if (i - hm.get(A[i]) < min) {
	                    min = i - hm.get(A[i]);
	                    present = true;
	                    hm.put(A[i], i);
	                }
	            } else {
	                hm.put(A[i], i);
	            }

	        }

	        if (present) {
	            return min;
	        }

	        return -1;

	    }

}
