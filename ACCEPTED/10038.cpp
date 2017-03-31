#include<stdio.h>
#include<algorithm>
#include<vector>
using namespace std;
int main()
{
  long n,a[3100],i,d;
    vector<long>b;
      while(scanf("%ld",&n)==1){
            b.clear();
           for(i=0;i<n;i++)
              scanf("%ld",&a[i]);
          for(i=0;i<n-1;i++){
              if(a[i]<a[i+1])
                 d=a[i+1]-a[i];
          else
              d=a[i]-a[i+1];
              b.push_back(d);}

          sort(b.begin(),b.end());
          long h=0;
          for(i=0;i<n-1;i++){
              //printf("%ld ",b[i]);
                 if(b[i]!=i+1){
                   printf("Not jolly\n");
                   h=1;
                   break;}}
              if(h==0)
                 printf("Jolly\n");
      }

    return 0;
}
