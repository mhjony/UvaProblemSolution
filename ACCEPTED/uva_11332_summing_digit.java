import java.util.Scanner;
	class uva_11332_summing_digit
	{
		public static void main(String args[])
		{
			Scanner input=new Scanner(System.in);
			while(input.hasNext())
			{
				long n,div=0,rem=0,result=0;
				n=input.nextLong();
				if(n==0)
					break;
				while(true)
				{
			       if(n>9)
					div=n/10;
					rem=n%10;
					result=div+rem;
					if(result<=9)
						break;
				  	n=result;
				}
          			System.out.println(""+result);
			}

		}
	}