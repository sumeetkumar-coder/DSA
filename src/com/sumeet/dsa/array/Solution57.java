package com.sumeet.dsa.array;

import java.util.Arrays;

public class Solution57 {

	public static void main(String[] args) {
		
		int[] a = primesum(4);
		System.out.println(Arrays.toString(a));

	}
	
	public static int[] primesum(int A) {

        int[] res = new int[2];

        int[] arr = new int[A+1];

        arr[0] = 1;
        arr[1] = 1;

        for (int i=2; i*i <=A ; i++) {

            for (int j= i*i; j<=A ; j=j+i) {
                arr[j] = 1;
            }

        }
        
        System.out.println(Arrays.toString(arr));

        for (int p=0,q=arr.length-1; p<=q ; p++,q--) {

            if (arr[p] == 0 && arr[q] == 0 && (p + q == A)) {
                res[0] = p;
                res[1] = q;
                break;
            }

        }

        return res;


    }

}
