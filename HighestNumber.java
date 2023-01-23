package com.PracticeProblem;

public class HighestNumber {

	public static void main(String[] args) {
		int a = 200;
		int b = 400;
		int c = 220;
		int d = 500;
		
		if(a > b && a > c && a > d) {
			System.out.println ("Highest number is" + "  " + a);
		}
		else if(b > c && b > d) 
		{
			System.out.println ("Highest number is" + "  " + b);
		}else if(c > d) 
		{
			System.out.println ("Highest number is" +"  "  + c);
		}else
		{
			System.out.println ("Highest number is" +"  "  + d);
	     }
	}
}


