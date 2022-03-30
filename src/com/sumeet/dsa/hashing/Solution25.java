package com.sumeet.dsa.hashing;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution25 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public int[] solve(int[] A, int[] B) {

	      
	       Map<Integer,Integer> m = new HashMap<>();
	        
	        for (int i=0; i<A.length; i++) {
	            if (m.containsKey(A[i])) {
	                int value = m.get(A[i]) + 1;
	                 m.put(A[i], value);
	            } else {
	                m.put(A[i],1);
	            }
	            
	        }

	        List<Integer> l = new ArrayList<>();

	        for (int j=0; j<B.length; j++) {
	            if (m.containsKey(B[j]) && m.get(B[j]) > 0) {
	                int value = m.get(B[j]) - 1;
	                 m.put(B[j], value);

	                 l.add(B[j]);
	            }
	        }
	        int[] res = l.stream().mapToInt(i -> i).toArray();
	       return res;


	    }

}
