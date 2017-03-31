import java.util.Scanner;
	class uva_age_sort
	{
		public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			int n,i,a,b,sort;
			n=input.nextInt();
			a=0;
			for(i=1;i<=n;i++)
			{
			a=i;
			if(a>i)
				System.out.println(""+a);
			else
				System.out.println(""+i);
			}



		}
	}