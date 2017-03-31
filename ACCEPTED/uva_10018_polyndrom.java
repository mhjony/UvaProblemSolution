import java.util.Scanner;
	class uva_10018_polyndrom
	{
		public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			long n,m,k,x,y,z,p,sum,t,i;
			t=input.nextLong();
			for(i=1;i<=t;i++)
			{
				sum=0;
				z=0;
				n=input.nextLong();
				while(true)
				{
					m=0;
					p=n;
					while(n>0)
					{
						m=m*10+n%10;
						n=n/10;
					}
					x=m;
					y=p;
				 	if(x==y)
				  	 break;
					z=x+y;
					n=z;
					sum=sum+1;
				}
					System.out.print(""+sum);
					System.out.println(" "+z);
			}

		}
	}