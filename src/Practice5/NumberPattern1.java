package Practice5;

public class NumberPattern1 {

	public static void main(String[] args) {
 
		for(int i=1;i<=5;i++)
		{
			for(int j=5;j>=i;j--)
			{
				System.out.print(j);
			}
			System.out.println();
		}
	}

}
