package Practice5;

public class ReverseString {

	public static void main(String[] args) {

		String s="Nanda";
		String rev=" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
		
		if(s.equals(rev))
		{
			System.out.println("is palindrome");
		}else
		{
			System.out.println("not palindrome");
		}
	}
	

}
