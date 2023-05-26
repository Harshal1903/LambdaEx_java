package org.file.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LargestNumber {

	public static void main(String[] args) {
		ArrayList<Integer> arrList1 = new ArrayList<>();

		arrList1.add(85);
		arrList1.add(42);
		arrList1.add(9);
		arrList1.add(88);
		arrList1.add(39);

		Consumer<List<Integer>> largest = inputList -> {
			int max = inputList.get(0);
			for (int iTmp = 0; iTmp < inputList.size(); iTmp++)
			{
				if (inputList.get(iTmp) > max)
				{
					max = inputList.get(iTmp);
				}

			}
			System.out.println(inputList);
			System.out.println("\nLargest Number= " + max);

		};
		largest.accept(arrList1);

	}

}
