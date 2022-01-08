package practice4;

public class StarPattern4 {

	public static void main(String[] args) {

		
		for(int i=1;i<=5;i++)             //i=3   //i=3  j=2
			                              //j=1
		{
			for(int j=5;j>=1;j--)         //-----*   //-----*
				                                     //----*-*
				                          //----*-*  //---*-*-*
			{                             //---*-*-*
				if(j>i)
				{
				System.out.print(" ");
			}
				else
				{
					System.out.print(" *");
				}
			}
				System.out.println();
		}
	}

	}

