#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
void pattern(int n)
{
    int nst=1, i=1;
    for(int r=1; r<=n; r++)
    {
        for(int cst=1; cst<=nst; cst++)
        {
            cout<<i<<'\t';
            i++;
        }
        nst++;
        cout<<endl;
    }
    
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int n;
    cin>>n;
    pattern(n);
    return 0;
}
