package Practice5;

import java.util.Arrays;

public class Ascending {

	public static void main(String[] args) {

		
		int[] a= {10,50,40,21,63,2,8};
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("*******************");
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
