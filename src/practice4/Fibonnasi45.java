package practice4;

public class Fibonnasi45 {

	public static void main(String[] args) {
   
		
		int x=0,y=1;
		System.out.println(x+" "+y);
		int z;
		for(int i=1;i<=15;i++)
		{
			z=x+y;
			System.out.println(" "+z);
			x=y;
			y=z;
		}
	}

}
