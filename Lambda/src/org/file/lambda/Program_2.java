package org.file.lambda;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Program_2 {

	public static void main(String[] args) {
		
		String [] names = {"Pratik", "Tejas", "Ajay", "Chetan", "Yash", "Jayesh"};
		
		List<String> listNames = Arrays.asList(names);
		
	    System.out.println("Before sorting the list is ");	    
	    System.out.println(listNames);
	    System.out.println("*************************************************");
	    
	    Comparator<String> nameCompare = (str1, str2)->str1.compareTo(str2);
	    
	    listNames.sort(nameCompare);	    
	    listNames.sort(((str1, str2)->str1.compareTo(str2)));	    
	    System.out.println("After sorting the list is ");	    
	    System.out.println(listNames);
	

	}

}
