package com.lava;

import java.util.Scanner;

public class Solution {

	public static int search(int[] array, int target) {
		if (array == null)
			return -1;
		int len = array.length;
		int i = 0;
		while (i < len) {
			if (array[i] == target)
				return i;
			else
				i = i + 1;
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("enter value");
		int N;
		N = scan.nextInt();
		int[] array = new int[N];
		for (int j = 0; j < N; j++) {
			array[j] = scan.nextInt();

		}

		int target;
		target = scan.nextInt();

		int result;
		result = search(array, target);
		System.out.println(result);
	}
}
