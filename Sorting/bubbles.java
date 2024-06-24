package Sorting;

import java.util.*;

public class bubbles{
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of Array ");
		int size = in.nextInt();
		int[] arr = new int[size];
		System.out.println("Enter the Element of Array");
		for (int i = 0; i < size; i++) {
			arr[i] = in.nextInt();
		}
		in.close();
		bubbleSort(arr);
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	static void bubbleSort(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 1; j < arr.length - i; j++) {
				if (arr[j] < arr[j - 1]) {
					int temp = arr[j];
					arr[j] = arr[j - 1];
					arr[j - 1] = temp;
				}
			}
		}
	}
}
