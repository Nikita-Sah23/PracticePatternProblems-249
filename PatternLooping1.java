package com.PracticeProblem;

public class PatternLooping1 {

	public static void main(String[] args) {
		int i, j, row=5;
		
		for(i=row; i>=1; i--) {
			
		for(j=row; j>=i; j--) {
			
			System.out.print(j + "");
		}
		    System.out.println();
	}

}

}


/* 5 
   54 
   543
   5432
   54321  */