package kk;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("enter size of array");
		int size = s.nextInt();
		int a[] = new int[size];
		System.out.println("enter values");
		for (int i = 0; i < size; i++) {
			a[i] = s.nextInt();

		}
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println(); 
		for (int i = 0; i < a.length; i++) {
			if (a[i] == 0) {
				a[i] = 1;
			} else if (a[i] == 1) {
				a[i] = 0;
			}

			else {
				a[i] = a[i];
			}
			System.out.print(a[i] + " ");
		}

	}

}
