#include<iostream>
#include<stdio.h>
using namespace std;

int main()
{
    //freopen("in.txt","r",stdin);
    //freopen("out.txt","w",stdout);
    int c, a, b;

    cin>>c;
    for(int i=1; i<=c; i++) //for case
        {
            cin>>a>>b;

            for(int j=1; j<=b; j++)
            {
                for(int m=1; m<=a; m++)
                {
                    for(int p=1; p<=m; p++)
                        cout<<m;
                cout<<endl;
                }
                for(int n=a-1; n>=1; n--)
                {
                    for(int q=1; q<=n; q++)
                        cout<<n;
                cout<<endl;
                }
            if(j<b)
                cout<<endl;
            }

        if(i<c)
          cout<<endl;

        }
return 0;
}
