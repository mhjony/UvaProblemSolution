import java.util.Scanner;
	class swapping
	{
		public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			int a,b,i,j,n=1;
			a=input.nextInt();
			b=input.nextInt();
			for(j=1;j<=b;j++)
			{
			for(i=a;i<=b;i++)

				//n=i%j;
				if(i%j==0)

				System.out.println(""+i);
			}


		}
	}