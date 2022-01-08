package Practice5;

public class ReverseSenString {

	public static void main(String[] args) {

		
		String s="Java is very important";
		String rev =" ";
		for(int i=s.length()-1;i>=0;i--)
		{
			rev=rev+s.charAt(i);
		}
		System.out.println(rev);
	}

}
