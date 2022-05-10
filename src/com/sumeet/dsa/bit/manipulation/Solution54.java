package com.sumeet.dsa.bit.manipulation;

public class Solution54 {

	public static void main(String[] args) {

	}
	
	public int singleNumber(final int[] A) {

        int res = 0;

        for (int i=0; i<32 ; i++) {

            int no1 = 0;
            for (int j=0; j<A.length; j++) {
                if (((A[j] >> i) & 1) == 1) {
                    no1++;
                }
            }

            if ((no1 % 3) != 0) {
                res = res + (1<<i);
            }

        }

        return res;


    }

}
