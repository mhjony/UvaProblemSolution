#include<iostream>
#include<stdio.h>
#include<iomanip>
using namespace std;

int main(){
long a[100],i=0;
do{
    i++;
    cin>>a[i];
    }while(a[i]!=0);
cout<<"PERFECTION OUTPUT\n";

long c;
for(c=1;c<i;c++){
long k,j,m;
m=0;
j=0;
for(k=1;k<=a[c]/2;k++){
if(a[c]%k==0&&a[c]/k>1)
    j=j+k;
    }
    m=j;
if(m==a[c])
    cout<<setw(5)<<a[c]<<"  "<<"PERFECT\n";
else if(m<a[c])
    cout<<setw(5)<<a[c]<<"  "<<"DEFICIENT\n";
else
    cout<<setw(5)<<a[c]<<"  "<<"ABUNDANT\n";
}
cout<<"END OF OUTPUT\n";

return 0;
}
