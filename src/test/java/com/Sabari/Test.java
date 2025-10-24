package com.Sabari;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner S = new Scanner(System.in);
		System.out.println("Type City Names");
		String a = S.nextLine();
		String b[] = a.split(" ");

		for (int i = 0; i < b.length; i++) {
			if (i == 0) {
				System.out.print(b[1] + " ");
			} else if (i == 1) {
				System.out.print(b[0] + " ");
			} else {
				System.out.print(b[i] + " ");
			}

		}

	}

}
