package com.flipkart;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);

	        System.out.print("Enter your age: ");
	        int age = sc.nextInt();

	        if (age >= 18) {
	            System.out.println("You are eligible to vote!");

	            System.out.println("Choose your candidate:");
	            System.out.println("1. elakiya");
	            System.out.println("2. ziya");
	            System.out.println("3. kavya");

	            System.out.print("Enter your choice (1-3): ");
	            int choice = sc.nextInt();

	            switch (choice) {
	                case 1:
	                    System.out.println("You voted for elakiya.");
	                    break;
	                case 2:
	                    System.out.println("You voted for ziya.");
	                    break;
	                case 3:
	                    System.out.println("You voted for kavya.");
	                    break;
	                default:
	                    System.out.println("Invalid choice.");
	            }
	        } else {
	            System.out.println("Sorry, you are not eligible to vote.");
	        }

	        sc.close();
	    }
	
		// TODO Auto-generated method stub

	}


