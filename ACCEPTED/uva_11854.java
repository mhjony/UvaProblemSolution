import java.util.Scanner;
	class uva_11854
	{
		public static void main(String args[])
		{
		Scanner input=new Scanner(System.in);
		int a,b,c,m,n,p,max;
		while(input.hasNext())
		{
				a=input.nextInt();
				b=input.nextInt();
				c=input.nextInt();
				m=a*a;
				n=b*b;
				p=c*c;
				{
				if(a==0&&b==0&&c==0)
					break;
			if(a>b)
				if(a>c)
					max=a;
				else
					max=c;
			else
				if(b>c)
					max=b;
				else
					max=c;

			if((max==a) && (m==n+p))
				System.out.println("right");
			else if((max==b) && (n==m+p))
				System.out.println("right");
			else if((max==c) && (p==m+n))
				System.out.println("right");
			else
				System.out.println("wrong");
				}
		}

		}
	}