package com.PracticeProblem;

public class PrintPattern {

	public static void main(String args[]) {
//i for rows and j for columns      
//row denotes the number of rows you want to print  
		int i, j, row = 6;

		for (i = 0; i < row; i++) {

			for (j = 0; j <= i; j++) {
				System.out.print("* ");
			}

			System.out.println();
		}
	}
}