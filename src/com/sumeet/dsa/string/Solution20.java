package com.sumeet.dsa.string;

/*
 * You are given a string A of size N.

Return the string A after reversing the string word by word.
 * 
 * 
 * 
 */


public class Solution20 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution20 obj = new Solution20();
		
		System.out.println(obj.solve("gi hhrozchn zpapijcez jqxpcl rw zlf wu dpsii zkuat "));

	}
	
	 public String solve(String A) {

	       int i = 0;
	       int j = 0;

	       String s = reverseString(A.trim());

	       StringBuilder sb = new StringBuilder();

	       while (j< s.length()) {

	          
	           while ((j< s.length()) && (s.charAt(j) != ' ')) {
	               j++;
	              
	           }
	           
	           String s1 = reverseString(s.substring(i,j));
	              sb.append(s1);
	              sb.append(" ");
	              i= j+1;
	              j++;

	       }

	       return sb.toString();

	    }

	    public String reverseString(String A) {

	        int i=0;
	        int j = A.length()-1;

	        char[] c = A.toCharArray();

	        while (i < j) {
	            char temp = c[i];
	            c[i] = c[j];
	            c[j] = temp;
	            i++;
	            j--;
	        }

	        return String.valueOf(c);

	    }

}
