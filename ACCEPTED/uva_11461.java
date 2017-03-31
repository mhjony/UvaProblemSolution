import java.util.Scanner;
import java.lang.Math;
class uva_11461
{
	public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	int i,a,b,k,m,sum=0;
	while(input.hasNext())
	{
		sum=0;
		a=input.nextInt();
		b=input.nextInt();
		if(a==0 && b==0)
			break;
		for(i=a;i<=b;i++)
		{
			k=(int)Math.sqrt(i);
			m=k*k;
			if(m==i)
			sum=sum+1;
		}
		System.out.println(""+sum);
	}




	}
}