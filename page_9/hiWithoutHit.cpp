#include <cmath>
#include <cstdio>
#include <vector>
#include <iostream>
#include <algorithm>
using namespace std;
string newString(string str, string ans, int idx, int count)
{
    if (idx == str.length())
    {
        cout << count << endl;
        return ans;
    }
    
    if (str[idx] == 'h' && str[idx + 1] == 'i' && idx + 1 != str.length())
    {
        if (str[idx + 2] != 't' && idx + 2 != str.length())
        {
            return newString(str, ans, idx + 2, ++count);
        }
        else if (idx + 2 == str.length())
        {
            return newString(str, ans, idx + 2, ++count);
        }
        else
        {
            return newString(str, ans + str[idx], idx + 1, count);
        }
    }
    else
    {
        return newString(str, ans + str[idx], idx + 1, count);
    }
}

int main() {
    string s;
    cin >> s;
    int i;
    cin >> i;
    string str = newString(s, "", 0, 0);
    cout << str[i] << endl;
    cout << str;
    return 0;
}
