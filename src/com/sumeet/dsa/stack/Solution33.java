package com.sumeet.dsa.stack;

import java.util.Stack;

public class Solution33 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	 public int solve(String A) {

	        Stack<Character> st = new Stack<>();

	        for (int i=0; i<A.length(); i++) {
	            if (A.charAt(i) == '(') {
	                st.push('(');
	            } else {
	                if (st.isEmpty()) {
	                    return 0;
	                } else {
	                    st.pop();
	                }
	            }
	        }

	        if (!st.isEmpty()) {
	            return 0;
	        }

	        return 1;

	    }

}
