package com.sumeet.dsa.array;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Solution5 {

	public static void main(String[] args) {
		
		
		String r = largestNumber(Arrays.asList(0, 0, 0, 0, 0));
		System.out.println(r);
	}
	
	  public static String largestNumber(final List<Integer> A) {

	        Comparator<Integer> c = (a,b) -> {

	            String s1 = ""+a+b;
	            String s2 = ""+b+a;

	            return s2.compareTo(s1);
	        };

	        Collections.sort(A, c);

	        StringBuilder sb = new StringBuilder();

	        for (int i=0; i<A.size(); i++) {
	            if (A.get(i)==0 && (sb.length() == 0)) {
	                continue;
	            }
	            sb.append(A.get(i));
	        }
	       if (sb.length() == 0) {
	           sb.append("0");
	       }
	        String s = sb.toString();
	        return s;
	    }

}
