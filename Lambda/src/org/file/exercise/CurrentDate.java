package org.file.exercise;

import java.util.Date;
import java.util.function.Supplier;

public class CurrentDate {

	public static void main(String[] args) {
		
		Supplier<Date> date = () -> {
			Date newDate = new Date();
			newDate.setDate(24);   

			return newDate;
			
		};

		System.out.println("Date : " + date.get());
	}

}
