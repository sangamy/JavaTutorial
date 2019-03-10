package library;

import java.util.Scanner;
import java.lang.*;

/**
 * Arithmetic Library Demo (Re-usability : Create once & use many times)
 * 
 * @author Sangam 
 */

public class ArithmeticDemo {
	
	
	int age = 11 ; 
	String name = "John";

	//Default Constructor (Automatically executed as an when the class in instantiated)

	public ArithmeticDemo(){
		
		System.out.println("This is a default constructor!");
		System.out.println("Age = "+ this.age);
		System.out.println("Name = "+ this.name);
	}
	
	public ArithmeticDemo(int age, String name){
	    this.age = age;
	    this.name = name;

		System.out.println("This is a Parameterized constructor!");
		System.out.println("Age = "+ this.age);
		System.out.println("Name = "+ this.name);

	}

	// User-defined functions

	// Addition

	public int add(int a, int b){

		int c = a + b; 
		System.out.println("The sum of "+ a + " and "+b + " = "+c);
		return c;

	}




	// Difference

	public int subtract(int a, int b){

		int c = a - b; 
		c = Math.abs(c); //Built-in function
		System.out.println("The absolute difference of "+ a + " and "+b + " = "+c);
		return c;

	}

	// Product

	public int product ( int a, int b){
		int c = a*b;
		System.out.println("The product of "+a + " and "+ b + " = "+ c);
		return c;
	}


	// Division

	public int divide ( int a, int b){
		int c = a/b;
		System.out.println("The integral part of quotient when "+a + " is divided by "+ b + " = "+ c);
		return c;
	}


	
	// Polymorphism (Overloading)
	public double divide(double m, double n)
	{
		double quotient;
		quotient=m/n;
		System.out.println("The exact result of dividing "+ m +" and "+ n +" is "+ quotient);
		return quotient;
	}

	// Function to accept individual part of a name and age and print a sentense
	
	//Static function

	public static int moduloOfNumbers (int a, int b){
		System.out.println("Remainder of two numbers when they are divided in that order = "+a%b);

		return a%b;
	}

	// Multiplication Table

	
	/* 7 * 1 = 7
     7 * 2 = 14
     
     7 * 10 = 70*/
     
	public void multiTable(int n)
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(n + "*" + i+" = " +(n*i));  
		}
	}

	//Multiple multiplication tables
	public void multiTable(int maxNumberForTable, int tableLines)
	{
		for(int i=1;i<=maxNumberForTable;i++)
		{
			for (int j=1;j<=tableLines;j++)
			{ 
				System.out.print(i*j+", ");
			}
			System.out.println();    
		}

	}

	public static int subtraction(int x, int y)
	{
		int diff;
		if (x>y)
			diff=x-y;
		else
			diff=y-x; 


		System.out.println("the difference of two numbers is "  +diff);
		return diff;


	}

	public static int min(int x, int y){

		if(x<y)
			return x;
		else
			return y;

	}


	public static int perimeterOfTriangle(int a, int b, int c)
	{
		int perimeter=a+b+c;
		System.out.println("the value of the perimeter of Triangle is:" +perimeter);
		return perimeter;

	}
	public static int perimeterOfRectangle(int l, int w)
	{
		int perimeter= 2*(l+w);
		System.out.println("the value of the perimeter of rectangle is:" +perimeter);
		return perimeter;

	}



	public static void display(int maxnum){
		for (int i=1; i<=maxnum; i++){
			if(i%3==0 && i%5==0)
				System.out.println("DingDong");
			else if(i%3==0)
				System.out.println("Ding");
			else if(i%5==0)
				System.out.println("Dong");

			else System.out.println(i);
		}
	}

	public void numbersDisplay()
	{      
		int n,times=100;

		System.out.print("Displaying numbers 1 through 100: \n");
		for(n=1;n<=times;n++)
		{

			System.out.print(n+",");

		}  
	}

	/*	Write a java program which will count the number 
		of vowels, consonants, digits, tabs and blank spaces from 
		a string */

	public static void countLetters(String x){
		int vowels = 0;
		int nonVowels = 0;

		System.out.println("Length of sentence is "+ x.length());

		x=x.toLowerCase();
		for(int i=0; i<x.length(); i++){
			char ch = x.charAt(i);
			if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' )
				vowels= vowels +1;
			else 
				nonVowels++;
		}


		System.out.println("vowels = "+vowels);
		System.out.println("Non-Vovels (Consonants + Spl chars) = "+nonVowels);



	}

	public double simpleInterest(double principal, double rate, double time)
	{
		// Initialize instance variables
		// int p=1000,r=8,t=2;
		double value;     
		value=(principal*rate*time)/100;
		System.out.println("The rate of interest is " +value);
		return value;
	}

	// Swapping
	public void swap(int a, int b)
	{
		int x, y, t;
		x=a;
		y=b;
		System.out.println("Original values of a and b are " +x+ " and " +y);

		t=y;
		y=x;
		x=t;
		System.out.println("values of a and b after swapping are " +x+" and " +y);
	}

	
}
