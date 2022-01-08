package practice4;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {

		int[] a= {10,56,78,2,96,13};
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
