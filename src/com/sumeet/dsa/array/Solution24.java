package com.sumeet.dsa.array;

import java.util.List;

/*
 * "You're given a read-only array of N integers. Find out if any integer occurs more than N/3 times in the array in linear time and constant additional space.
 * If so, return the integer. If not, return -1."
 * 
 */

public class Solution24 {

	public static void main(String[] args) {

		

	}
	
	public int repeatedNumber(final List<Integer> a) {

        int mec1 = Integer.MIN_VALUE;
        int freq1 = 0;

         int mec2 = Integer.MIN_VALUE;
        int freq2 = 0;

        for (int i=0; i<a.size(); i++) {
            int x =  a.get(i);
             if (mec1 ==x) {
                freq1++;

            } else if (mec2 == x) {
                freq2++;
            }  else if(freq1 == 0)  {
                freq1++;
                mec1 =x;
            } else if(freq2 == 0)  {
                freq2++;
                mec2 =x; 
            } else {
                 freq1--;
                freq2--;
            }

        }

       
        int maxFreq1 = 0;
        int maxFreq2 = 0;

        for (int i=0; i<a.size(); i++) {
            int x =  a.get(i);
            if (x == mec1) {
                maxFreq1++;
            }
            if (x == mec2) {
                maxFreq2++;
            }
        }
       
        if (maxFreq1 > (a.size()/3)) {
            return mec1;
        } else if (maxFreq2 > (a.size()/3)) {
            return mec2;
        } else {
            return -1;
        }

        

	}

}
