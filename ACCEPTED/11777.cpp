#include<stdio.h>

int main()
{
     long i,T;
    scanf("%ld",&T);

    for(i=1;i<=T;i++)
    {
    float t1,t2,f,a,c1,c2,c3,c,m,d;

    scanf("%f%f%f%f%f%f%f",&t1,&t2,&f,&a,&c1,&c2,&c3);
    d=c1;
    if(c2<d)
    d=c2;
    if(c3<d)
    d=c3;

c=((c1+c2+c3)-d)/2;
m=t1+t2+f+a+c;

if(m>=90)
    printf("Case %ld: A\n",i);
else if(m>=80&&m<90)
    printf("Case %ld: B\n",i);
else if(m>=70&&m<80)
    printf("Case %ld: C\n",i);
else if(m>=60&&m<70)
    printf("Case %ld: D\n",i);
else
    printf("Case %ld: F\n",i);

    }
return 0;
}
