package cpm.cg.training.ui;

public class StringReshape {

		public static String reshape(String str,char ch)
	{
		StringBuffer s=new StringBuffer(str);
		s.reverse();
		System.out.println("The reversed string is: "+s.toString());
		//s.append(ch);
		//System.out.println("The append string is.."+s.toString());
		String str1=s.toString();
		int len=str1.length();
		System.out.println("The result is: ");
		String a="";
		for(int i=0;i<len-1;i++)
		{
			a=a+str1.charAt(i)+ch;
		}
		a=a+str1.charAt(len-1);
		return a;
	}
	
}
