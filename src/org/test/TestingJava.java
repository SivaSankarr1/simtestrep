package org.test;

public class TestingJava {

	public static void main(String[] args) {
		System.out.println("Both works merged");
		System.out.println("Below are B works");

		System.out.println("Baranch A work");

		String str = "madam";
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			char charAt = str.charAt(i);

			rev = rev + charAt;
		}
		if(rev.equals(str)) {
			System.out.println("Palindrome");
		}
	}
}