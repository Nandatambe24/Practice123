package practice4;

public class PrimeNo {

	public static void main(String[] args) {

		
		int x=13,temp=0;
		for(int i=2;i<=x-1;i++)
		{
			if(x%i==0)
			{                                //int i=2;i<=x-1;i++
				temp=temp+1;
			}
		}
		if(temp>0)
		{
			System.out.println(x+ "not prime number");
		}
		else
		{
			System.out.println(x+ " prime number");
		}
		}
	}


