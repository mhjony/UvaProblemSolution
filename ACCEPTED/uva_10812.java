import java.util.Scanner;
	class uva_10812
	{
		public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			int n,a,b,i,result=0,sub=0;
			n=input.nextInt();
			for(i=1;i<=n;i++)
			{
				a=input.nextInt();
				b=input.nextInt();

				if(a<b||(a+b)%2==1)
					System.out.println("impossible");
				else
				{
					result=(a+b)/2;
					System.out.print(""+result);
					sub=a-result;
					System.out.println(" "+sub);
				}

			}


		}
	}