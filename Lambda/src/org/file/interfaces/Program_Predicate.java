package org.file.interfaces;

import java.util.List;

import java.util.function.Predicate;

public class Program_Predicate {

	public static void main(String[] args) {
		
		//Predefined Functional Interfaces
	/*	
		  1. Predicate -> take 1 parameter and return a boolean (test condition) 
		  2. function  -> take 1 parameter and return same type of parameter
		  3. Consumer  -> take 1 parameter but return nothing (void) 
		  4. Supplier -> zero argument but returns a value
	*/	 
		
		Predicate<String> lengthString = str ->	str.length() > 5;
		
		Predicate<String> splCharater =str -> {
			char [] splChars = {'@', '#', '$'};
			for(int iTmp=0; iTmp<splChars.length; iTmp++)
				if(str.indexOf(splChars[iTmp])!=-1)
					return true;
			
			return false;
		};
		
		// Testing if 2 predicates satisfy the condition where both should be true
		
		String data = "Harsh#al";
		
		boolean status = lengthString.and(splCharater).test(data);
		
		if(status)
			System.out.println("Entered string is correct");
		else
			System.out.println("Invalid String");
		
		System.out.println("*************************************************");
		
		
				
    }
}
















