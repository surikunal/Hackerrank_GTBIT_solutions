#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
int fibo(int n)
{
    if(n == 0)
        return 0;
    else if (n == 1)
        return 1;
    else 
        return(fibo(n-1) + fibo(n-2));
}

int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */ 
    int n;
    cin>>n;
    int res = fibo(n);
    cout<<res;
    return 0;
}
