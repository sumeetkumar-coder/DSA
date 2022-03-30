package com.sumeet.dsa.bit.manipulation;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/*
 * "Given an array of positive integers A, two integers appear only once, and all the other integers appear twice.
Find the two integers that appear only once."

 * 
 * 
 */

public class Solution17 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {2,7,7,3,2,4};
		System.out.println(Arrays.toString(solve(a)));
	}
	
	 public static int[] solve(int[] A) {

	        Map<Integer,Integer> m = new HashMap<>();

	        int[] res = new int[2];

	        for (int i=0; i<A.length; i++) {
	             
	            if (m.containsKey(A[i])) {
	                int value = m.get(A[i]) + 1;
	                m.put(A[i], value);
	            } else {
	                 m.put(A[i], 1);
	            }
	        }

	        int count = 0;
	        for (Map.Entry<Integer,Integer> m1 : m.entrySet()) {
	            if (m1.getValue() == 1) {
	                res[count] = m1.getKey();
	                count++;

	                if (count == 2) {
	                    break;
	                }
	            }
	        }

	         Arrays.sort(res);

	        return res;


	    }

}
