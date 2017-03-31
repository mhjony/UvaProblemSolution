import java.util.Scanner;
	class 10055{
		public static void main(String args[]){
			Scanner input=new Scanner (System.in);
			long a,b,dif;
			while(input.hasNext())
			{
			a=input.nextLong();
			b=input.nextLong();
			if(a>b)
				dif=a-b;
			else
				dif=b-a;
				System.out.println(""+dif);
			}


	}
}