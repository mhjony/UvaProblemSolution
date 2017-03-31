import java.util.Scanner;
	class uva_11727
	{
		public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			int n,a,b,c,i,mid;
			n=input.nextInt();
			for(i=1;i<=n;i++)
			{
				a=input.nextInt();
				b=input.nextInt();
				c=input.nextInt();
					if(a>=b && a<=c || a<=b && a>=c)
							mid=a;
						else if(c>=a && c<=b || c<=a && c>=b)
							mid=c;
					else
							mid=b;
						System.out.println("Case "+i+": "+mid);

			}

		}
	}

