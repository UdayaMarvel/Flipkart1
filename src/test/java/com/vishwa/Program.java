package com.vishwa;

public class Program {

	public static void main(String[] args) {

		int rows = 9;

		for (int i = 1; i <= rows; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print(j + " ");
			}
			System.out.println("This line is modified in vishwa");
		}
	}
}
