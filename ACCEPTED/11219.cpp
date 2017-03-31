#include<iostream>
#include<cstdio>
using namespace std;

int main()
{
    //freopen("in.txt","r",stdin);
    //freopen("out.txt","w",stdout);
    long t;
    cin>>t;
      getchar();
    for(int i=1; i<=t; i++)
    {
        getchar();
    char ch1[100];
    char ch2[100];
    gets(ch1);
    gets(ch2);
    long a,b,c,p,q,r;
    long d,m,y;
    sscanf(ch1,"%ld%*c%ld%*c%ld",&a,&b,&c);
    sscanf(ch2,"%ld%*c%ld%*c%ld",&p,&q,&r);
    /***For Day***
    if(a<p)
        d=(30+a)-p;
    else
        d=a-p;

    /*** For Month***
    if(a<p)
    {
        if(b<q)
            m=(b+12)-(q+1);
        else
            m=b-(q+1);
    }
    else
    {
        if(b<q)
            m=(12+b)-q;
        else
            m=b-q;
    }*/

    /****For Year*****/
    if(a<p){
        if(b<q+1)
            y=c-(r+1);
        else
            y=c-r;
    }
    else{
        if(b<q)
            y=c-(r+1);
        else
            y=c-r;
    }

    cout<<"Case #"<<i<<": ";
    if(y<0)
        cout<<"Invalid birth date"<<endl;
    else if(y>130)
        cout<<"Check birth date"<<endl;
    else
        cout<<y<<endl;

    }

return 0;
}
