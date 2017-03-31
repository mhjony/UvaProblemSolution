import java.util.Scanner;
class horro_desh
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	int n,i;
	n=input.nextInt();
	for(i=1;i<=n;i++)
		{

			int m,j,p=0;
			m=input.nextInt();
			System.out.print("Case "+i+": ");
			for(j=0;j<m;j++)
			{

				j=p;
				if(p<p+1)
				System.out.println("+p+1");
				else
				System.out.println("+p");


			}

		}

	}
}
