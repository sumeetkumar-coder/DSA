package com.sumeet.dsa.hashing;

import java.util.ArrayList;
import java.util.List;

public class Solution29 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int diffPossible(final int[] A, int B) {

	        List<Integer> list = new ArrayList<>();

	        for (int i=0; i<A.length; i++) {

	            int temp = A[i] - B;
	            int temp1 = A[i] + B;
	            if (list.contains(temp) || list.contains(temp1)) {
	                return 1;
	            }
	            list.add(A[i]);
	        }

	        return 0;
	    }

}
