import java.util.Scanner;
	class uva_11805;
	{
		public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			int i,p,n,m,l;
			p=input.nextInt();
			for(i=1;i<=p;i++)
			{

				n=input.nextInt();
				m=input.nextInt();
				l=input.nextInt();
				System.out.print("Case "+i+": ");
				if(m+l<n)
				System.out.println(""+(m+l));
				else if((m+l)%n==0)
				System.out.println(""+n);
				else
				System.out.println(""+(m+l)%n);
			}


		}
	}