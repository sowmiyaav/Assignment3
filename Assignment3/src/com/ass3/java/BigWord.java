package com.ass3.java;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class BigWord {
	
	 public String name;
	
	public static void main(String[] args) {
		
		Scanner scanner= new Scanner(System.in);
		
		 String word = "development";
		 
          System.out.println("The big word is "+ word);
          
          System.out.println("------------------------------------------------------");
          
         Set<Character> uniquecharacter =new HashSet<Character>();
         
           for (Character c : word.toCharArray()) {
			
			 uniquecharacter.add(c);
			 
		} 
		 
		 System.out.println(uniquecharacter.size());
		 
		 Map<Character, Integer> charOccurence = new HashMap<Character, Integer>();
		 
		 for ( char c : word.toCharArray()) {
			 
			charOccurence.put(c, charOccurence.getOrDefault(c, 0)+1);
		
		 }
		 
		  System.out.println("------------------------------------------------------------");
		 
		 System.out.println("charOccurrence of"+ word);
		 
		 for(Map.Entry<Character, Integer> entry : charOccurence.entrySet()) {
			 
			 System.out.println("'" + entry.getKey()+"': "+ entry.getValue());
		 }
		 
		 System.out.println("--------------------------------------------------------"); 
		 
		 
		 char[] reverseorder = word.toCharArray();
		 
		 for (int i = reverseorder.length-1; i>=0 ; i--) {
			
			 System.out.println(reverseorder[i]);
		}
		 
		 System.out.println("--------------------------------------------------------"); 
		 
		 String[] split = word.split("o");
		 
		 for (int i = 0; i < split.length; i++) {
			
			 System.out.println(split[i]);
		}
	}

}
