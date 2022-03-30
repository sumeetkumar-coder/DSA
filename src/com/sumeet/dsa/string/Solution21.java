package com.sumeet.dsa.string;

public class Solution21 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution21 obj = new Solution21();
		System.out.println(obj.longestPalindrome("aba"));

	}
	
	 public String longestPalindrome(String A) {

	        char[] c = A.toCharArray();

	        int max = 1;
	        int startIndex = 0;
	        int endIndex = 1;

	        for (int i=0; i<c.length; i++) {
	           
	            int oddValue = findPallndrome(c,i,i);
	             if (oddValue > max) {
	                 max = oddValue;
	                 startIndex = i - ((oddValue-1)/2);
	                 endIndex = i + ((oddValue-1)/2) + 1;
	            }

	            if (i < c.length-1) {
	               int evenValue = findPallndrome(c,i,i+1);

	               if (evenValue > max) {
	                    max = evenValue;
	                    startIndex = i - ((evenValue-2)/2);
	                     endIndex = i + 1 + ((evenValue -2)/2) +1 ;
	                }


	            }    
	           
	        }

	      
	        return A.substring(startIndex, endIndex);

	    }

	    public int findPallndrome(char[] c,int p1, int p2) {

	        while (p1>=0 && p2<c.length) {
	            if (c[p1] != c[p2]) {
	                break;
	            }
	            p1--;
	            p2++;
	        }

	        return p2-p1-1;

	    }

}
