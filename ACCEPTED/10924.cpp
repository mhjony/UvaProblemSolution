#include<iostream>
#include<string.h>
#include<stdio.h>
long prime(long i);
using namespace std;

int main()
{
  //  freopen("input.txt","r",stdin);
    //freopen("output.txt","w",stdout);
  char ch[25];
  while(cin>>ch)
  {
  long b,n,s=0,sum=0;
  n=strlen(ch);
  long k;
  for(k=0;k<n;k++)
    {
        b=ch[k];
        if(b>=65&&b<=90)
            s=b-38;
        else if(b>=97&&b<=122)
            s=b-96;
        //else
            //break;
            sum=sum+s;
}
    if(prime(sum)==1)
        printf("It is a prime word.\n");
    else
        printf("It is not a prime word.\n");
  }
  return 0;
}

long prime(long i)
{
    long j;
  if(i==2 || i==1)
    return 1;
  else if(i%2==0)
    return 0;
    else
    {
        for(j=3;j*j<=i;j+=2)
            if(i%j==0)
                return 0;
    }
    return 1;
}
