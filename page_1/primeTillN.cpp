#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
void primeno(int n)
{
    for(int i=2; i<=n; i++)
    {
        int c=0;
        for(int j=1; j<=i;j++)
        {
            if(i%j==0)
            {
                c++;
            }
        }
        if(c==2)
        {
            cout<<i<<" ";
        }
    }
}

int main() {
    int n;
    cin>>n;
    primeno(n);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
