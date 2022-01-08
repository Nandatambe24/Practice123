package Practice5;

import java.util.Arrays;

public class Anagram1 {

	public static void main(String[] args) {

		String x="SILENT";
		String y="LISTEN";
		
		char[] a=x.toCharArray();
		char[] b=y.toCharArray();
		
		Arrays.sort(a);
		Arrays.sort(b);
		
		Boolean result=Arrays.equals(a, b);
		
		if(result==true)
		{
			System.out.println("String is Anagram ");
		}else
		{
			System.out.println("String is not Anagram");
		}
				
	}

}
