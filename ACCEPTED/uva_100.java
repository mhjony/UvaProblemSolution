import java.util.Scanner;
	class uva_100
	{
		public static void main(String args[])
		{
		Scanner input=new Scanner(System.in);
		int n,a=0,b,m,p,i,k,max,x,y;
    	while(input.hasNext()){
		n=input.nextInt();
		p=input.nextInt();
		x=n;
		y=p;
		max=0;
		if(p<n)
		{
			k=p;
			p=n;
			n=k;
		}
		for(k=n;k<=p;k++)
		{
		i=k;
		a=1;
		while(true)
			{
			if(i==1)
                 break;
		if(i%2==1)
			i=(3*i)+1;
        else
            i=i/2;
            a=a+1;
			}
		   if(max<a)
                max=a;
		}
			System.out.println(x+" "+y+" "+max);
        }

		}
	}