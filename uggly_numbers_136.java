import java.util.Scanner;
	class uggly_numbers_136
	{
		public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			int i,n,m;
			for(i=1;i<=1500;i++)
			{
				if(i%2==0||i%3==0||i%5==0)
				System.out.print(" "+i);
			}


		}
	}