package com.sumeet.dsa.subSequence;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Solution43 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution43 obj = new Solution43();
		
		System.out.println(obj.subsets(new ArrayList<Integer>(Arrays.asList(12,13))).toString());

	}
	
	 public ArrayList<ArrayList<Integer>> subsets(ArrayList<Integer> A) {

	        int n = A.size();

	        ArrayList<ArrayList<Integer>> list = new ArrayList<ArrayList<Integer>>();
	        
	        list.sort(null);

	        for (int i=0; i< (1<<n) ; i++) {

	        	ArrayList<Integer> l = new ArrayList<Integer>(); 
	 
	            for (int j=0; j<n ; j++) {

	                if ( (i & (1<<j)) > 0) {
	                    l.add(A.get(j));
	                }

	            }

	            list.add(l);

	        }
	        
	        Collections.sort(list, (a, b) -> {
	        	
	        	for (int i=0; i<a.size() && i<b.size(); i++) {
	        		
	        		if (a.get(i) > b.get(i)) {
	        			return 1;
	        		} else if (a.get(i) < b.get(i)) {
	        			return -1;
	        		}
	        		
	        	}
	        	
	        	if (a.size() > b.size()) {
	        		return 1;
	        	}
	        	
	        	return -1;
	        });
	        

	        return list;
	    }

}
