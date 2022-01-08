package practice123;

public class FibonnacciSeries {

	public static void main(String[] args) {

		
		int x=0,y=1;
		System.out.println(x+" "+y);
		for(int i=1;i<=15;i++)
		{
			int z;
			{     z=x+y;
				System.out.println(" "+z);
				x=y;
				y=z;
			}
		}
	}

}
