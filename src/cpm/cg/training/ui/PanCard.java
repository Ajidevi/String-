package cpm.cg.training.ui;
import java.util.Scanner;
import java.util.regex.Pattern;
public class PanCard {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string:");
		String str=sc.nextLine();
		if(isValidPAN(str))
		{
			System.out.println("PAN Card is valid");
		}
		else
		{
			System.out.println("Invalid PAN Card");
		}
		sc.close();
	}

	private static boolean isValidPAN(String str) {
          String str1="[A-Z]{5}[0-9]{4}[A-Z]{1}{10}";
          //if(str1.matches(str))
          if(Pattern.matches(str1, str))
          {
        	  return true;
          }
          else
        	  return false;
          }
	}
