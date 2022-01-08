package practice123;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {

		
		String x="LISTEN";
		String y="SILENT";
		
		char[] a=x.toCharArray();
		char[] b=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result = Arrays.equals(a,b);
		if(result==true)
		{
			System.out.println("is anagram");
		}else
		{
			System.out.println("not anagram");
		}
	}

}
