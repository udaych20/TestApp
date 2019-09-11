package com.Jocata;

import java.util.Arrays;

public class Jocata3DArray {
	public static void main(String[] args) {
		int a[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		int b[][] = new int[3][3];
		for (int i = 0; i < a.length; i++) {
			System.out.println(Arrays.toString(a[i]));
			for (int j = 0; j < a[i].length; j++) {
				b[i][j] = a[j][i];
			}
		}
		System.out.println();
		Arrays.asList(b).stream().forEach(x -> System.out.println(Arrays.toString(x)));
	}
}