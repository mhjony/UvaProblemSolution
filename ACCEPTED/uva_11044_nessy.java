import java.util.Scanner;
	class uva_11044_nessy
	{
		public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			long n,i;
			n=input.nextLong();
			for(i=1;i<=n;i++)
			{
				long a,b,first,second,result=0;
				a=input.nextLong();
				b=input.nextLong();
				first=a/3;
				second=b/3;
				result=first*second;
				System.out.println(""+result);
			}




		}
	}