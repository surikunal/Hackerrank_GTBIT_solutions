#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;

void prime1(int num, int i)
{
    if(i == 1)
    {
        cout<<"Prime";
    }
    else
    {
        if(num % i == 0)
        {
            cout<<"Not Prime";
        }
        else
        {
            prime1(num, i-1);
        }   
    }
}
int main() {
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    int num;
    cin>>num;
    prime1(num, num/2);
    return 0;
}
