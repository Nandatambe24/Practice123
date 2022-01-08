package practice4;

public class PalindromeNo {

	public static void main(String[] args) {

		int x=212;
		int rem,sum=0,temp;
		temp=x;
		
		while(x>0)
		{
			rem=x%10;
			sum=(sum*10)+rem;
			x=x/10;
			
		}if(temp==sum) 
		{
			System.out.println("palindrome no");
		}else
		{
			System.out.println("not palindrome");
		}
		
		
	}

}
