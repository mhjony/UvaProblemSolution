#include<iostream>
using namespace std;

int f(int n)
{
    if(n>=101)
        return(n-10);
    else
        return(f(f(n+11)));
}
int main()
{
    for(int i=0; ;i++)
    {
        int n;
        cin>>n;
        if(n==0)
            break;
        if(n>=101)
            cout<<"f91("<<n<<") = "<<n-10<<endl;
        else
            cout<<"f91("<<n<<") = "<<f(n)<<endl;
    }

return 0;
}
