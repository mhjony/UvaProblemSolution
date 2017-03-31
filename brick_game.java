import java.util.Scanner;
	class brick_game
	{
		public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			int n,i,j,k,a;;
			n=input.nextInt();
			for(i=1;i<=n;i++)
			{
				a=input.nextInt();
				for(j=1;j<=a;j++)
				{
					j=input.nextInt();
					j=(a/2)+1;
					System.out.print(""+j);
				}


			}


		}
	}