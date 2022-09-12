package kk;

import java.util.*;

public class vijay {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter String to continue");

		String s = sc.nextLine();

		String rev = "";
		String s1[] = s.split(" ");

		// char c[] = s1.toCharArray();

		// System.out.println(c);

		for (int i = s1.length - 1; i >= 0; i--) {
			rev = rev + s1[i] + " ";

		}

		System.out.println(rev);

		System.out.println(rev.replace('v', 'V'));

		// rev = rev.toUpperCase();
		// System.out.println(rev);

	}

}
