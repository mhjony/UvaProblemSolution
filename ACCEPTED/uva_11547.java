import java.util.Scanner;
class uva_11547
{
public static void main(String args[])
	{
Scanner input=new Scanner(System.in);
int n,i;
n=input.nextInt();
for(i=1;i<=n;i++)
		{
		int p,result,m,d,add,mul,div,sub,tresult=0;
	p=input.nextInt();
		m=p*567;
	d=m/9;
		add=d+7492;
	mul=add*235;
		div=mul/47;
	sub=div-498;
		result=sub/10;
	result=result%10;
	if(result<0)
	tresult=result*2;
	result=result-tresult;
	System.out.println(""+result);

		}

	}
}