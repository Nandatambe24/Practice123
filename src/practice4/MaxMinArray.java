package practice4;

public class MaxMinArray {



	public static void main(String[] args) {

		
		int[] a= {10,56,-45,78,-100,86};
		int max=0,min=0;
		for(int i=0;i<a.length;i++)
		{
			if(a[i]>max)
			{
				max=a[i];
			}
		}
		System.out.println("max value "+max);
		
		for(int i=0;i<a.length;i++)
		{
			if(a[i]<min)
			{
				min=a[i];
			}
		}
	
			System.out.println("min value"+min);
		}
		}



