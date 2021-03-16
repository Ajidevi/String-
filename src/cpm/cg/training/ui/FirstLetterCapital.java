package cpm.cg.training.ui;

import java.util.Scanner;

public class FirstLetterCapital {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
        String str=sc.nextLine();
        str=str.toLowerCase();
        System.out.println("The String after convertion is: "+str);
        System.out.println("The result is: "+printCapitalized(str));
        sc.close();
	}

	public static String printCapitalized(String str) {
	        StringBuffer s = new StringBuffer();
	        char ch = ' ';
	        for (int i = 0; i < str.length(); i++) {
	             
	            if (ch == ' ' && str.charAt(i) != ' ')
	            {
	                s.append(Character.toUpperCase(str.charAt(i)));
	                
	            }
	            else
	            {
	                s.append(str.charAt(i));
	            }
	            ch = str.charAt(i);
	            //System.out.println("......"+ch);
	        }
	        return s.toString().trim();
	    
	 }

}
