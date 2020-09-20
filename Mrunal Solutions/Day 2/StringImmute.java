package com.hsbc.day2;

public class StringImmute {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "The quick brown fox jumps over the lazy dog";
		StringBuilder sb = new StringBuilder(s);
		
		System.out.println("Char at 12th position is :" + sb.charAt(12) + "\n");
		
		if(sb.indexOf("is")>0)
				System.out.println("Yes the string contains IS word\n");
		else
			System.out.println("NO the string does not contain IS word\n");
		
		//sb.append(" and killed it");
		//System.out.println(sb);
		
		if(sb.indexOf("dog", (sb.length()-5))>0)
			System.out.println("dogs word is present at end\n");
		else
			System.out.println("dogs word is not present at end\n");
		
		if(s.equals("The quick brown fox jumps over the lazy dog"))
			System.out.println("String is eaqual to The quick brown Fox jumps over the lazy Dog\n");
		else
			System.out.println("String is not eaqual to The quick brown Fox jumps over the lazy Dog\n");
		
		if(s.equals("THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG"))
			System.out.println("String is eaqual to THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG\n");
		else
			System.out.println("String is not eaqual to THE QUICK BROWN FOX JUMPS OVER THE LAZY DOG\n");
		
		System.out.println("Charcter a is at position : "+ sb.indexOf("a"));
		System.out.println("Charcter e is at position : "+ sb.indexOf("e"));
		
		 System.out.println("\nLength of the string is : " + sb.length());
		 
		 System.out.println(s.toUpperCase());
		 System.out.println(s.toLowerCase());
		 
		 sb.replace(sb.indexOf("a"), sb.indexOf("a")+3, "The");
		 System.out.println(sb);
		
	}
	

}
