#include<iostream>
#include<stdio.h>
using namespace std;

int main()
{
unsigned int a,b;
while(1)
{
scanf("%u%u",&a,&b);
if(a==0&&b==0)
    break;
int p[10],q[10];
long i=0,r1=0,d1=0,x=0;
do
    {
    r1=a%10;
    d1=a/10;
    a=d1;
    p[i]=r1;
    i++;
    }while(a!=0);
x=i-1;

long r2=0,d2=0,y=0;
i=0;
do
    {
        r2=b%10;
        d2=b/10;
        b=d2;
        q[i]=r2;
        i++;
    }while(b!=0);
y=i-1;

long k;
if(y>x)
    k=y;
else
    k=x;

    long ca=0,c=0,j;
if(x>y)
    for(i=y+1;i<=x;i++)
        q[i]=0;
else
    for(i=x+1;i<=y;i++)
        p[i]=0;


for(j=0;j<=k;j++)
{
  if(p[j]+q[j]+ca>=10)
  {
      ca=1;
      c=c+1;
  }
  else
        ca=0;
}

if(c==0)
    printf("No carry operation.\n");
else if(c==1)
    printf("%ld carry operation.\n",c);
else
    printf("%ld carry operations.\n",c);

}
  return 0;
}
