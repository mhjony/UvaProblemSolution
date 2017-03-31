import java.util.Scanner;
	class uva_11172{
		public static void main(String args[]){
			Scanner input=new Scanner(System.in);
			long a,b,n,i;

			n=input.nextLong();

			for(i=1;i<=n;i++)
			{
			a=input.nextLong();
			b=input.nextLong();
			if(a>b)
				System.out.println(">");
			else if(a==b)
				System.out.println("=");
			else
				System.out.println("<");
			}



	}
}