package practice;

import java.io.*;
import java.util.Scanner;

public class Triangles {
	

	public static void main(String args[])
	{	Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		//		INCREASING TRIANGLE
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
//		DECREASING TRIANGLE
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i+1; j++)
			{
				System.out.print("$ ");
			}
			System.out.println();
		}
		
//		RIGHT SIDED INCREASING TRIANGLE
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
//		RIGHT SIDED DECREASING TRIANGLE
		 for(int i=0; i<n ; i++)
		 {
			 for(int j=0; j<=i; j++)
			 {
				 System.out.print(" ");
			 }
			 for(int j=1; j<=n-i; j++)
			 {
				 System.out.print("*");
			 }
			 System.out.println();
		 }

}
}
