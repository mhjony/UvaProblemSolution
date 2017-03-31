import java.util.Scanner;
	class uva_10970{
		public static void main(String args[]){
			Scanner input=new Scanner(System.in);
			long a,b,mul,result;
			while(input.hasNext())
			{
			a=input.nextLong();
			b=input.nextLong();
			mul=a*b;
			result=mul-1;
			System.out.println(""+result);
			}





	}
}