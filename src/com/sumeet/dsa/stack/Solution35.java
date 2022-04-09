package com.sumeet.dsa.stack;

import java.util.Stack;

public class Solution35 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(solve("{([])}"));

	}
	
	 public static int solve(String A) {

	        Stack<Character> stack = new Stack<>();

	        for (int i=0; i<A.length(); i++) {

	            if (A.charAt(i) == '{' || A.charAt(i) == '[' || A.charAt(i) == '(') {
	                stack.push(A.charAt(i));
	            } else {
	                if (stack.isEmpty()) {
	                    return 0;
	                }
	                char c = stack.pop();

	                if (A.charAt(i) == '}' && c != '{') {
	                    return 0;
	                } else if (A.charAt(i) == ')' && c != '(') {
	                    return 0;
	                } else if (A.charAt(i) == ']' && c != '[') {
	                    return 0;
	                }

	            }

	        }

	        if (!stack.isEmpty()) {
	            return 0;
	        }

	        return 1;

	    }

}
