#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
void pat(int n)
{
    int nst = 1 ,nsp=n/2;
    for(int r=1; r<=n; r++)
    {
        for(int csp=1; csp<=nsp; csp++)
        {
            cout<<" ";
        }
        for(int cst=1; cst<=nst; cst++)
        {
            cout<<"*";
        }
        if(r<=n/2)
        {
            nst+=2;
            nsp--;
        }
        else{
            nsp++;
            nst-=2;
        }
        cout<<endl;
    }
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    cin>>n;
    pat(n);
    return 0;
}
