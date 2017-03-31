#include<iostream>
#include<cstdio>
using namespace std;

int main()
{
    for(int i=1; ;i++)
    {
        long a, b, n;
        cin>>a>>b;

        if(a==-1)
            break;
        n=a;
        int c=1;
        do
        {
            if(n%2==0)
                n=n/2;
            else
                n=3*n+1;

        if(n>b)
            break;
        c++;
        }while(n>1);

        cout<<"Case "<<i<<": A = "<<a<<", limit = "<<b<<", number of terms = "<<c<<endl;
    }

return 0;
}
