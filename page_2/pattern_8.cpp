#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
void pattern(int n)
{
    int nst=1;
    int nsp=n-1;
    for(int r=1; r<=n; r++)
    {
        for(int csp=1; csp<=nsp; csp++)
        {
            cout<<"  ";
        }
        int val = r;
        for(int cst=1; cst<=nst; cst++)
        {
            cout<<val<<" ";
        
            if(cst <= nst/2)
            {
                val++;
            }
            else
            {
                val--;
            }
        }
        nsp--;
        nst+=2;
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
