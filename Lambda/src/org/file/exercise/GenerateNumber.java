package org.file.exercise;

import java.util.function.Supplier;

public class GenerateNumber {

	public static void main(String[] args) {

		Supplier<String[]> randomNo = () -> {
			
			try {
				
				while (true)
				{
					int pos = (int) (Math.random() * 4);
					String otp = String.valueOf(pos);
					for (int iTmp = 0; iTmp < 2; iTmp++)
						otp += (int) (Math.random() * 9);
					System.out.println(otp);
					Thread.sleep(2000);
					break;
				}
			} 
			catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
			return args;
		};
		String[] numbers = randomNo.get();
		for (String str : numbers)
			System.out.println(str);
	}
}
