package com.cap.training.pl;

import java.util.Scanner;

import cpm.cg.training.ui.StringReshape;

public class TesterClass {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		System.out.println("Enter the character:");
		char ch=sc.next().charAt(0);
		System.out.println("The final String is: "+StringReshape.reshape(str, ch));
		sc.close();

	}

}
