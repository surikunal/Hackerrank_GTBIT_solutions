#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;


int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */  
    int i=1,n1,n2,k=1;
    cin>>n1;
    cin>>n2;
    while(i<=n2)
    {
        if(n1 % i == 0)
        {
            if(n2 % i == 0)
            {
                k = i;
            }
        }
        i++;
    }
    cout<<k;
    
    return 0;
}
