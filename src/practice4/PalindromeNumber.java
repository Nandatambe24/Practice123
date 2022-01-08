package practice4;

public class PalindromeNumber {

	public static void main(String[] args) {


		
		int a=221;
		int rem,sum=0,temp;
		temp=a;
		
		while(a>0)
		{
			rem=a%10;
			sum=(sum*10)+rem;
			a=a/10;
			
		}
		if(temp==sum)
		{
			System.out.println("number is a palindrome");
		}else
		{
			System.out.println("Number is not a palindrome");
		}
	}

}
