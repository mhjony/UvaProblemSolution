#include<iostream>
#include<cstdio>
#include<string.h>
#include<string>
using namespace std;
int main()
{
    //freopen("txtin.txt","r",stdin);
    //freopen("txtout.txt","w",stdout);
    string ch[100000];
    int i=0;
    while(getline(cin,ch[i]))
        i++;


    int m=0;
    for(int j=0; j<i; j++)
    {
        for(int k=0; k<ch[j].size(); k++)
            {
                if(ch[j][k]==34)
                {
                    m++;
                    if(m%2==1)
                        cout<<"``";
                    else
                        cout<<"''";
                }
                else
                    cout<<ch[j][k];
            }
        cout<<endl;
     }
return 0;
}
