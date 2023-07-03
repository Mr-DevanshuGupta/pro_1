#include <iostream>
#include <array>
using namespace std;
int smar(int arr[], int n)
{

    // int n = arr.size();
    int sum1 = 0;
    int sum2 = 0;
    int sum3 = 0;
    int ans;
    for (int i = 0; i < n; i += 2)
    {
        sum1 += arr[i];
    }
    for (int i = n - 1; i >= 0; i -= 2)
    {
        sum2 += arr[i];
    }

    for (int i = 1; i < n; i += 2)
    {
        sum3 += arr[i];
    }
    if (sum1 > sum2 && sum1 > sum3)
    {
        ans = sum1;
    }
    else if (sum2 > sum1 && sum2 > sum3)
    {
        ans = sum2;
    }
    else
    {
        ans = sum3;
    }
    return ans;
}
int main()
{
    // Write C++ code here
    int arr[]{10, 20, 50, 80, 10};

    int len = sizeof(arr) / sizeof(arr[0]);
    int ans = smar(arr, len);

    cout << ans;
    return 0;
}