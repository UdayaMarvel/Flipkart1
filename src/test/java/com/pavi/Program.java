package com.pavi;

public class Program {
public static void main(String[] args) {
	String s = "pavithra";
	String vowels="";
	String nonvowels="";
	for(int i = 0;i<s.length();i++) {
		char b = s.charAt(i);
		if(b=='a'||b=='e'||b=='i'||b=='o'||b=='u') {
			vowels=vowels+b;			
		}else {
			nonvowels=nonvowels+b;
		}
			
	}
System.out.println("Vowels:"+vowels);
System.out.println("NonVowels:"+nonvowels);
}
}
