//package statement - package packageName;
package com.java.main;

//public -?? class - keyword MainClass - className
public class MainClass {

	//class body/block
	
	//main method
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//calling a method
		System.out.println("Inside main");
		//creating an object: classname objname=new constructorname();
		MainClass mainClass=new MainClass();
		
		int n1=100;
		int n2=750;
		
		//calling a method using object as a reference
		int output=mainClass.findTheGreatestOfTwo(n1,n2);
		
		System.out.println(output);
	}
	
	//define a method to find whether a number is prime or not
	int findPrimeOrNot()
	{
		//return type should match
		return 10;
	}
	
	boolean findEvenOrNot(int number)
	{
		if(number%2==0)
		{
		return true;
		}
		
		else
		{
		return false;
		}
	}
	
	int findTheGreatestOfTwo(int n1,int n2)
	{
		if(n1>n2)
		{
			return n1;
		}
		else
		{
			return n2;
		}
	}

}
