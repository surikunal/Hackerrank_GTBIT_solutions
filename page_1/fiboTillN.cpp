#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
void fibo(int n)
{
    int n1=0,n2=1,sum=0;
    if(n==0)
    {
        cout<<"0 ";
    }
    else if(n==1)
    {
        cout<<"0 1 1"<<" ";
    }
    else
    {   
        // cout<<"0"<<" "<<"1"<<" ";
        // cout<<n1<<" "<<n2<<" ";
        while(n1 <= n)
        {
            cout<<n1<<" ";
            sum = n1 + n2;
            n1 = n2;
            n2 = sum;
        }
    }
}
int main()
{
    int n;
    cin>>n;
    fibo(n);
    return 0;
}
