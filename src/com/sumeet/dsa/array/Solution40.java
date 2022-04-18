package com.sumeet.dsa.array;

public class Solution40 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Solution40 obj = new Solution40();
		int x = obj.solve(new int[]{3, 12, 11, 11, 11, 15}, 12);
		System.out.println(x);
	}
	
	public int solve(int[] A, int B) {

        int count = 0;

        for (int i=0; i<A.length; i++) {

            for(int j=i; j<A.length; j++) {
                boolean odd = ((j-i+1) & 1) == 1 ? true : false;
                if(goodArray(A, B, i, j, odd)) {
                    count++;
                }
            }

        }

        return count;

    }

    public boolean goodArray(int[] A,int B, int start, int end, boolean odd) {

    	System.out.println("start:" + start + "end:" + end);
        int sum = 0;

        for(int i=start; i<=end; i++) {
            sum += A[i];
        }

        if (odd && sum>B) {
            return true;
        } else if (!odd && sum < B) {
             return true;
        }

        return false;

    }

}
