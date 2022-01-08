package practice123;

public class Primrnum {

	public static void main(String[] args) {

		int x=13,temp=0;
		for(int i=2;i<=x-1;i++)
		{
			if(x%i==0)
			{
				temp=temp+1;
			}
		}
		   if(temp>0)
			{
				System.out.println("not prime no");
			}else
			{
				System.out.println("prime no");
			}
		}
	}


