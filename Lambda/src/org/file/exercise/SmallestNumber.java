package org.file.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class SmallestNumber {

	public static void main(String[] args) {
		
		ArrayList<Integer> arrList = new ArrayList<>();
		
		arrList.add(85);
		arrList.add(42);
		arrList.add(9);
		arrList.add(88);
		arrList.add(39);
		
		Consumer<List<Integer>> smallest = inputList -> {
			int min = inputList.get(0);
			for (int iTmp = 0; iTmp < inputList.size(); iTmp++)
			{
				if (inputList.get(iTmp) < min)
				{
					min = inputList.get(iTmp);
				}
			}
			System.out.println(inputList);
			System.out.println("\nSmallest Number= " + min);
		};
		smallest.accept(arrList);
}
}
