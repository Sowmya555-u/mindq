package com.icici.loans.personalloans;

import java.util.Scanner;

public class ArrayDemo 
{

	public static void main(String[] args) 
	{
		/*
		 * int[] a= {10,20,30,40};
		 * 
		 * for(int i=0;i<a.length;i++) { System.out.println("a["+i+"]="+a[i]); }
		 */
		
		
		int asize;
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the array Size :");
		asize=sc.nextInt();
		
		int[] a=new int[asize];
	
		System.out.println("Enter the array Elements :");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			System.out.print("a["+i+"]="+a[i]);
			sum=sum+a[i];
		}
		System.out.println("Sum of the array is : " + sum);
	}

}
