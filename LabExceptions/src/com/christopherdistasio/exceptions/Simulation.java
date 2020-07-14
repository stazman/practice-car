package com.christopherdistasio.exceptions;

import java.util.Scanner;

public class Simulation {

	public static void main(String[] args) {
	
		try {
			
			getInput();
			
		} catch (EvenNumberException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public static void getInput() throws EvenNumberException {
		
		System.out.println("Type in a number and press Enter...");

		Scanner in = new Scanner(System.in);
		
		String line = in.nextLine();
		
		System.out.println("Your number is " + line);
		
		if (isEven(line)) {
			
			try {
				
				throw new EvenNumberException();
				
			} finally {
				
				in.close();
				
			}
			
		}		
		
	}
	
	public static boolean isEven(String num) {
		
		int parsedNum = Integer.parseInt(num);
		
		return (parsedNum % 2 == 0);
		
	}
	

}
