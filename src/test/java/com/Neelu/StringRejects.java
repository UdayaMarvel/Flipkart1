package com.Neelu;

public class StringRejects {
	
	public static void main(String[] args) {
        String str = "Programming";
        String result = "";

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            // Reject vowels
            if (ch != 'a' && ch != 'e' && ch != 'i' && ch != 'o' && ch != 'u' &&
                ch != 'A' && ch != 'E' && ch != 'I' && ch != 'O' && ch != 'U') {
                result += ch;
            }
        }

        System.out.println("Original String: " + str);
        System.out.println("After Rejecting Vowels: " + result);
    }

}
