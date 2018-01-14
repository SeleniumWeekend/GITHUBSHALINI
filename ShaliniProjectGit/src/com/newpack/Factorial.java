package com.newpack;

public class Factorial {

	public static void main(String[] args)
	{
		System.out.println("Factorial of a no");
		int fact = 1;
		int n = 8;
		for(int i =0; i<=n; i++)
		{
			fact = fact*i;
			
		}
		System.out.println("factorial of 8 is "+fact);
	}

}
