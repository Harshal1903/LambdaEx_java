package org.file.lambda;

public class Program {

	public static void main(String[] args) {
		
		AddCalculator addCalculator = new AddCalculator();
		
		int result = addCalculator.compute(80, 30);
		
		System.out.println(result);
		
        SubstractCalculator subCalculator = new SubstractCalculator();
		
		int subResult = subCalculator.compute(80, 30);
		
		System.out.println(subResult);
		
	}

}
