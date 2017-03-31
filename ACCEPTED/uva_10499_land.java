import java.util.Scanner;
	class uva_10499_land
	{
		public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			while(input.hasNext())
			{
				int n,result;
				n=input.nextInt();
				if(n<0)
					break;
					if(n==1)
						result=0;
					else
						result=25*n;
					System.out.println(result+"%");
			}

		}
	}