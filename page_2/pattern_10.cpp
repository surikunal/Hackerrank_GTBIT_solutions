#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
void pattern2(int rows)
{
    int nst = 1, nsp = 2 * rows - 3;
    for (int i = 1; i <= rows; i++) {
        int count = 1;
        bool flag = false;
        if (nsp <= 0) {
            flag = true;
        }
        for (int cst = 1; cst <= nst; cst++) {
            cout<<count<<" ";
            count++;
        }
        for (int csp = 1; csp <= nsp; csp++) {
            cout<<"  ";
        }
        for (int cst = 1; cst <= nst; cst++) {
            count--;
            if (flag) {
                flag = false;
                continue;
            }
            cout<<count<<" ";
        }
        nsp -= 2;
        nst++;
        cout<<endl;
    }
}

int main() {
    int n;
    cin>>n;
    pattern2(n);
    /* Enter your code here. Read input from STDIN. Print output to STDOUT */   
    return 0;
}
