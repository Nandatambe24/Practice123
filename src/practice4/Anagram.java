package practice4;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		
		String x="LISTEN";
		String y="SILENT";              //sort the data and sorted data equal then its an anagram.
		
		char[] a=x.toCharArray();
		char[] b=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result =Arrays.equals(a, b);
		if(result==true)
		{
			System.out.println("string is anagram");
		}else
		{
			System.out.println("string is not anagram");
		}
	}

}
