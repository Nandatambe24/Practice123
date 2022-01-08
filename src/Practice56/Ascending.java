package Practice56;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {

		
		int[] a= {10,56,47,12,25,86};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
