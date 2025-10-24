package com.Aakash;

public class StarPattern {

	public static void main(String[] args) {
		 int rows = 5;

	        for (int i = 1; i <= rows; i++) {
	            // Print spaces
	            for (int j = 1; j <= rows - i; j++) {
	                System.out.print(" ");
	            }
	            // Print stars
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }

	            System.out.println("java");

	        }
	    }
	
	

}
