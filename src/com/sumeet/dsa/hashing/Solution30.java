package com.sumeet.dsa.hashing;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Solution30 {

	public static void main(String[] args) {

		int[] arr = dNums(new int[]{1, 2, 1, 3, 4, 3}, 3);
		System.out.println(Arrays.toString(arr));

	}
	
	 public static int[] dNums(int[] A, int B) {

	        if (B > A.length) {
	            return new int[]{};
	        }

	        int[]  res = new int[A.length-B+1];
	        int count = 0;

	        Map<Integer, Integer> hm = new HashMap<>();

	        for (int i=0; i<B; i++) {

	            if(hm.containsKey(A[i])) {
	                int value = hm.get(A[i]) + 1;
	                 hm.put(A[i], value);
	            } else {
	                hm.put(A[i], 1);
	            }
	        }

	        res[count] = hm.size();
	        count++;

	        for (int j=1; j<=A.length-B; j++) {

	            if (hm.containsKey(A[j-1])) {
	                 int value = hm.get(A[j-1]);
	                if(value == 1) {
	                    hm.remove(A[j-1]);
	                } else {
	                    value--;
	                    hm.put(A[j-1], value);
	                }
	            }

	            if (hm.containsKey(A[j+B-1])) {
	                int value = hm.get(A[j+B-1]) + 1;
	                 hm.put(A[j+B-1], value);
	            } else {
	                 hm.put(A[j+B-1], 1);
	            }

	             res[count] = hm.size();
	             count++;

	        }

	        return res;
	        
	    }

}
