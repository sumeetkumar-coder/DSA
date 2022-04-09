package com.sumeet.dsa.hashing;

import java.util.HashMap;
import java.util.Map;

public class Solution31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution31 obj = new Solution31();
		
		int x = obj.solve(new String[]{"fine", "none", "no"}, "qwertyuiopasdfghjklzxcvbnm");
		System.out.println(x);

	}
	
	 public int solve(String[] A, String B) {

	        Map<Character,Integer> hm = new HashMap<>();

	        for (int i=1; i<=26; i++) {
	            hm.put(B.charAt(i-1), i);
	        }

	        for (int i=0; i<A.length-1; i++) {
	            if (!compare(hm, A[i], A[i+1])) {
	                return 0;
	            }
	        }

	        return 1;


	    }

	    public boolean compare(Map<Character,Integer> hm, String s1, String s2) {

	        int max = Math.min(s1.length(), s2.length());
	       

	        for (int i=0; i<max; i++) {
	            if (hm.get(s1.charAt(i)) > hm.get(s2.charAt(i)) ) {
	                return false;
	            } else if (hm.get(s1.charAt(i)) < hm.get(s2.charAt(i)) ) {
	                return true;
	            }
	        }

	        if(s1.length() <= s2.length()) {
	            return true;
	        }

	        return false;

	    }

}
