package org.test;

public class DuplicateCharinString {

	public static void main(String[] args) {
		String str="mahalakshmi";
		char[] ch = str.toCharArray();
			for(int i=0;i<str.length();i++) {
			char currentCharI = str.charAt(i);
			for (int j = str.length()-1; j>i; j--) {
				char currentCharJ = str.charAt(j);
				if ((currentCharI==currentCharJ)) {
				System.out.println(currentCharI);
				}
					
				}
			}
			
		}

	}


