import java.util.Scanner;
	class uva_10323
	{
		public static void main(String args[])
{
			Scanner input=new Scanner(System.in);
			while(input.hasNext())
		{
			long i,n,factorial=1;
			n=input.nextLong();
			if(n<0 && (-n)%2==0)
				System.out.println("underflow!");
				else if(n<0 && (-n)%2==1)
				System.out.println("overerflow!");
				else
				{
			if(n>13)
				System.out.println("Overflow!");
			else if(n<8)
				System.out.println("underflow!");
			else
				{
			for(i=n;i>=1;i--)
				factorial=factorial*i;
				System.out.println(""+factorial);
				}
			}
		}
	}
}