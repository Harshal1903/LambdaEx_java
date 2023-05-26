package org.file.interfaces;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;


public class Program_FunctionaI {

	public static void main(String[] args) {
		
		List<String> data = Arrays.asList(new String [] {"Red", "Green", "Black", "Yellow", "Pink"});
		
		Function <List<String>,List<String>> filter = inputList -> {
			ArrayList<String> filteredColors = new ArrayList<>();
			
			for(String color : inputList)
				if(color.endsWith("k"))
					filteredColors.add(color);
			return filteredColors;		
		}; 
		
		List<String> newColors = filter.apply(data);
		System.out.println(newColors);
	}
}
