package cpm.cg.training.ui;

import java.util.Scanner;

public class FirstLastWordComparison {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.nextLine();
		System.out.println("Number of characters in a string is: "+calculateWordSum(str));
		sc.close();

	}
	public static int calculateWordSum(String str)
	{
		String str1[]=str.split(" ");
		int len=str1.length;
		int a;
		  if(str1[0].matches(str1[len-1]))
			{
				a=str1[0].length();
				//System.out.println("...."+a);
			}
		  else
		  {
			  a=str1[0].length()+str1[len-1].length();
			 // System.out.println("..........."+a);
		  }
		return a;
	
	}

}
