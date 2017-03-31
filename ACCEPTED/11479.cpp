#include<iostream>
#include<stdio.h>
using namespace std;
int main()
{
    long T,i;
    scanf("%ld",&T);

    for(i=1;i<=T;i++)
    {
       long a,b,c;
        scanf("%ld %ld %ld",&a,&b,&c);

        if(a<1||b<1||c<1)
                printf("Case %ld: Invalid\n",i);
        else if((a+b)<=c||(a+c)<=b||(b+c)<=a)
                printf("Case %ld: Invalid\n",i);
        else if((a==b)&&(b==c))
            printf("Case %ld: Equilateral\n",i);
        else if(((a==b)&&b!=c)||((b==c)&&c!=a)||((c==a)&&a!=b))
            printf("Case %ld: Isosceles\n",i);
        else
            printf("Case %ld: Scalene\n",i);

    }
    return 0;
}
