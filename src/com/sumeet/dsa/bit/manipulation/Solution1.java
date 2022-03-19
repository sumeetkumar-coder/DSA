package com.sumeet.dsa.bit.manipulation;

public class Solution1 {

	public static void main(String[] args) {
	
		System.out.println(addBinary("101","11"));
	}
	
	 public static String addBinary(String A, String B) {

	        String first;
	        String second;

	       if (A.length() > B.length()) {
	           first = A;
	           second = B;
	       } else {
	           first = B;
	           second = A;
	       }

	        int carry = 0;
	        StringBuilder sb = new StringBuilder();

	        for (int i=first.length()-1,j=second.length()-1; i>=0; i--,j--) {

	            int one = first.charAt(i) - '0';
	            int two = 0;
	            if (j>=0) {
	              two = second.charAt(j) - '0';
	            }

	            
	            int r = (one + two + carry) % 2;
	            sb.append(r);

	            carry = (one + two + carry)/2 ;

	        }

	        if (carry > 0) {
	            sb.append(carry);
	        }

	        return sb.reverse().toString();
	        

	    }

}
