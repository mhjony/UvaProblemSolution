import java.util.Scanner;
	class uva_10071
	{
		public static void main(String args[])
		{
		Scanner input=new Scanner(System.in);
		long s,v,t;
		while(input.hasNext())
		{
		v=input.nextInt();
		t=input.nextInt();
		s=v*(2*t);
		System.out.println(""+s);
		}



	}
}

