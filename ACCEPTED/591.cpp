#include<iostream>
#include<cstdio>
using namespace std;

int main()
{
    for(int l=1; ;l++){
        int sum=0, av=0, t;
        cin>>t;
        if(t==0)
            break;
        int a[1000];
        for(int i=1; i<=t; i++){
            cin>>a[i];
            sum=sum+a[i];
        }
        av=sum/t;
        int m, tm=0;
        for(int i=1; i<=t; i++)
            if(a[i]>av){
                m=a[i]-av;
                tm=tm+m;
        }
        cout<<"Set #"<<l<<endl;
        cout<<"The minimum number of moves is "<<tm<<".\n"<<endl;
    }
    return 0;
}
