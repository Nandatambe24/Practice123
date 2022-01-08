package Practice56;

import java.util.Arrays;

public class Descending {

	public static void main(String[] args) {

		
		int[] a= {10,56,48,75,24,96,2};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		for(int i=6;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
