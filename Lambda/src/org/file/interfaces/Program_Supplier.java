package org.file.interfaces;

import java.util.function.Supplier;

public class Program_Supplier {

	public static void main(String[] args) {
		
		Supplier<String []> otpGenerator = ()-> {
			
			String [] otp = new String[5];
			
			char [] vowels = {'A','E','I','O','U'};
			
			for(int iTmp=0; iTmp<5 ; iTmp++) {
				
				int positionVowels = (int)(Math.random()*4);
				otp[iTmp] = String.valueOf(vowels[positionVowels]);
				
				for(int itmp=0; itmp<5 ; itmp++)
					otp[iTmp]+=String.valueOf((int)(Math.random()*9));
			}
			return otp;	
			};
			
			String [] otps =otpGenerator.get();
			for(String single:otps)
				System.out.println(single);
		}

	}


