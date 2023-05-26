package org.file.lambda;

public class AddCalculator implements Calculator {

	@Override
	public int compute(int num1, int num2) {
		
		return num1 + num2;
	}

}
