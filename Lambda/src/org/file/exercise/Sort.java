package org.file.exercise;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Sort {

	public static void main(String[] args) {
		
			List<String> color =Arrays.asList(new String[] {"Red","Blue","Yellow","Green","Voilet","White"});
			
			System.out.println("Before sorting the colors :");			
			System.out.println(color);
			System.out.println("******************************************");
			
			Comparator<String> colorCompare = (str1,str2)->str1.compareTo(str2);
			Function<List<String>,List<String>> sortList = inputList->
			{
				color.sort(colorCompare);
				
				return color;
			};
			System.out.println("After sorting the colors :");
			System.out.println(sortList.apply(color));
			
		
		/*	for(String color : inputList)
	//			if(color)
					sortedColors.add(color);
			return sortedColors;		
		}; 
		
		List<String> newColors = sort.apply(data);
		System.out.println(newColors);
		*/
	/*	String [] arrString = {"Red", "Blue", "Voilet", "Green", "Black", "Yellow" };

        System.out.println("Input Array : "+ Arrays.toString(arrString));
        arrString = Arrays.stream(arrString).sorted().toArray(String[]::new);

        System.out.println("Array after sorted : "+ Arrays.toString(arrString));
    */

	}

}
