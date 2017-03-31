import java.util.Scanner;
	class uva_10783
	{
		public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			int n,a,b,c,d,i,j,k,sum=0,m,p;
			n=input.nextInt();
			for(i=1;i<=n;i++)
			{
			a=input.nextInt();
			b=input.nextInt();
			if(a<0)
			a=1;
			if(a%2==0)
				a=a+1;
			System.out.print("Case "+i+": ");
				{
			for(j=a;j<=b;j+=2)
				{
				sum=sum+j;
				}
			System.out.println(""+sum);
				sum=0;

				}

			}


		}
	}