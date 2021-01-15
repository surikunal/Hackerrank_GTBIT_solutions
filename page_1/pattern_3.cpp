#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
void pattern(int n)
{
    int nst = n/2+1;
    int nsp = 1;
    for(int r=1; r<=n; r++)
    {
        for(int cst = 1; cst<=nst; cst++)
        {
            cout<<"*";
        }
        for(int csp=1; csp<=nsp; csp++)
        {
            cout<<" ";
        }
        for(int cst = 1; cst<=nst; cst++)
        {
            cout<<"*";
        }
        if(r<n/2+1)
        {
            nst--;
            nsp+=2;
        }
        else
        {
            nst++;
            nsp-=2;
        }
        cout<<endl;
    }
}

int main() {
    int n;
    cin>>n;
    pattern(n);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
