import java.util.Scanner;
	class polyndrom
	{
		public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			int n,m=0,k,x,y,z=0,p,sum,t,i;
			t=input.nextInt();
			for(i=1;i<=t;i++)
			{
			sum=0;
			n=input.nextInt();
			while(true)
			{
			m=0;
			p=n;
				while(n>0)
				{
					m=m*10+n%10;
					n=n/10;
				}
				//System.out.println(""+m);

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