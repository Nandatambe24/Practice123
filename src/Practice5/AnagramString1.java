package Practice5;

import java.util.Arrays;

public class AnagramString1 {

	public static void main(String[] args) {

		
		String x="SILENT";
		String y="LISten";
		
		x=x.replace(" ", "");
		y=y.replace(" ", "");
		
		x=x.toLowerCase();
		y=y.toLowerCase();
		
		char[] a=x.toCharArray();
		char[] b=y.toCharArray();
		
		Boolean result=Arrays.equals(a, b);
		if(result==true)
		{
			System.out.println("is anagram");
		}else
		{
			System.out.println("not anagram");
		}
	}

}
