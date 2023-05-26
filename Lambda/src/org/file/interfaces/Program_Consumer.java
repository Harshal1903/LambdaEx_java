package org.file.interfaces;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Program_Consumer {

	public static void main(String[] args) {
		
		List<String> data = Arrays.asList(new String [] {"Red", "Green", "Black", "Yellow", "Pink"});
		
		Consumer<List<String>> printColors = colors ->{
			
			for(String color : colors)
			   System.out.println(color);
		};
		
		printColors.accept(data);

	}

}
