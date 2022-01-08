package Practice5;

import java.util.Arrays;

public class Descending {

	public static void main(String[] args) {

		int[] a= {10,56,86,21,23,79,6};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("****************");
		Arrays.sort(a);
		for(int i=6;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
