package practice4;

import java.util.Arrays;

public class DecendingArraySort {

	public static void main(String[] args) {

		
		int[] a= {20,45,12,78,54,10,99};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("***************");
		Arrays.sort(a);
		for(int i=6;i>=0;i--)
		{
			System.out.println(a[i]);
		}
	}

}
