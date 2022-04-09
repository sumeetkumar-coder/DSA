package com.sumeet.dsa.hashing;

import java.util.HashSet;

public class Solution34 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] A = { "....5..1.", ".4.3.....", ".....3..1", "8......2.", "..2.7....", ".15......", ".....2...", ".2.9.....", "..4...6.."  };
		Solution34 obj = new Solution34();
		System.out.println(obj.isValidSudoku(A));
	}

	public int isValidSudoku(final String[] A) {

		int[][] arr = new int[9][9];

		for (int i = 0; i < A.length; i++) {
			String s = A[i];

			s = s.replaceAll("\\.", "0");

			for (int j = 0; j < 9; j++) {
				arr[i][j] = s.charAt(j) - '0';
			}
		}

		for (int i = 0; i < arr.length; i++) { // this equals to the row in our matrix.
			for (int j = 0; j < arr[i].length; j++) { // this equals to the column in each row.
				System.out.print(arr[i][j] + " ");
			}
			System.out.println(); // change line on console as row comes to end in the matrix.
			System.out.println();
		}

		//System.out.println(checkHorizontal(arr, 9));
		//System.out.println(checkVertical(arr, 9));
		//System.out.println(checkSubArray(arr));
		if (checkHorizontal(arr, 9) && checkVertical(arr, 9) && checkSubArray(arr)) {
			return 1;
		}

		return 0;

	}

	public boolean checkHorizontal(int[][] B, int size) {

		for (int row = 0; row < size; row++) {
			HashSet<Integer> hs = new HashSet<Integer>();
			for (int col = 0; col < size; col++) {
				if (B[row][col] != 0 && !hs.add(B[row][col])) {
					return false;
				}
			}
		}

		return true;

	}

	public boolean checkVertical(int[][] C, int size) {

		for (int col = 0; col < size; col++) {
			HashSet<Integer> hs = new HashSet<Integer>();
			for (int row = 0; row < size; row++) {
				if (C[row][col] != 0 && !hs.add(C[row][col])) {
					return false;
				}
			}
		}

		return true;

	}

	public boolean checkSubArray(int[][] D) {

		for (int row = 0; row <= 6; row++) {

			for (int col = 0; col <= 6; col++) {
					if (!verifySubArr(D,row,col)) {
						return false;
					}
			}

		}

		return true;
	}
	
	public boolean verifySubArr(int[][] A, int startRow, int startCol) {

		
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int row=startRow; row<=startRow+2; row++ ) {
			for (int col= startCol; col<=startCol+2; col++) {
				if (A[row][col] != 0 && !hs.add(A[row][col])) {
					return false;
				}
			}
		}

		return true;
	}
	

	public boolean horiSubArr(int[][] A, int row, int startCol) {

		System.out.println();
		HashSet<Integer> hs = new HashSet<Integer>();
		for (int col = startCol; col <= startCol + 2; col++) {
			if (A[row][col] != 0 && !hs.add(A[row][col])) {
				return false;
			}

		}

		return true;
	}

	public boolean vertSubArr(int[][] A, int col, int startRow) {

		HashSet<Integer> hs = new HashSet<Integer>();
		for (int row = startRow; row <= startRow + 2; row++) {
			if (A[row][col] != 0 && !hs.add(A[row][col])) {
				return false;
			}

		}

		return true;
	}
}
