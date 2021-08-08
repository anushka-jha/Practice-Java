package practice;

import java.io.*;
import java.util.Scanner;

public class Hills {
	
	public static void main(String args[])
	{	Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
//		HILL PATTERN
		for(int i=1; i<=n ;i++)
		{
			for(int j=i; j<=n; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<i; j++)
			{
				System.out.print("*");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print(" ");
			}
			System.out.println();
			

		}
		
//		REVERSE HILL
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			for(int j=i; j<n; j++)
			{
				System.out.print("*");
			}
			for(int j=i; j<=n; j++)
			{
				System.out.print("*");
			}
			for(int j=1; j<=i-1; j++)
			{
				System.out.print(" ");
			}
			
			System.out.println();
		}
	}
}
