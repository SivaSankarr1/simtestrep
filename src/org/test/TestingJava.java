package org.test;

public class TestingJava {

	public static void main(String[] args) {
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