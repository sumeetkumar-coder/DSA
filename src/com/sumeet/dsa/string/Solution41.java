package com.sumeet.dsa.string;

import java.util.HashSet;

public class Solution41 {

	public static void main(String[] args) {

		System.out.println(lengthOfLongestSubstring("bbbbb"));

	}
	
	 public static int lengthOfLongestSubstring(String s) {
	        
		 int max = 0;
	        
	        HashSet<Character> hm = new HashSet<>();
	        
	        int current = 0;
	        
	        for (int i=0; i<s.length(); i++) {
	        	System.out.println("i:"+i + "current:" + current + "set:" + hm.toString());
	          
	            if (!hm.add(s.charAt(i))) {
	                if (current > max) {
	                    max = current;
	                }
	                hm.clear();
	                
	                int j=i-1;
	                current = 0;
	                hm.add(s.charAt(i));
	                while(s.charAt(i) != s.charAt(j)) {
	                   hm.add(s.charAt(j));
	                    current++;
	                    j--;
	                }
	               
	            }
	            
	            current++;
	           
	            
	        }
	         if (current > max) {
	          
	             max = current;
	                  
	         }
	        
	        return max;
	        
	    }

}
