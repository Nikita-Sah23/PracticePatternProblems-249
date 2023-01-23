package com.PracticeProblem;
import java.util.Scanner;

public class LargestOfTwo {

   public static void main(String[] args)
   {
      int First, Second, largest;
      Scanner obj = new Scanner(System.in);
      
      System.out.print("Enter the First Number: ");
      First = obj.nextInt();
      System.out.print("Enter the Second Number: ");
      Second = obj.nextInt();
      
      if(First>Second)
         largest = First;
      else
         largest = Second;
      
      System.out.println( largest);
   }
}