package com.PracticeProblem;
import java.util.*;

public class AddTwoNumber {

  public static void main(String[] args) {
    int x, y, sum;
    Scanner myObj = new Scanner(System.in); 
    System.out.println("Type a number:");
    x = myObj.nextInt();

    System.out.println("Type another number:");
    y = myObj.nextInt();

    sum = x + y;  //Calculate the sum 
    System.out.println("Sum is: " + sum); // Print the sum
  }
} 
