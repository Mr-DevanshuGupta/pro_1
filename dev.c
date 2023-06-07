// C++ code to build the largest house

#include <bits/stdc++.h>
using namespace std;

int main()
{
    int num;
    cout <<“Enter the number of houses : “;
    cin >> num;
    int house_number[num];
    int position[num];
    cout <<“Enter the house number and position of the house : “<< endl;
    for (int i = 0; i < num; i++)
    {
        cin >> house_number[i]; // Getting the house number as a single array
        cin >> position[i];     // Getting the position as a single array
    }
    cout <<“Input : “<< endl;
    for (int i = 0; i < num; i++)
    {
        cout <<“[“<< house_number[i] <<“,”<< position[i] <<“] “;
    }
    cout << endl;
    int copy_position[num];
    for (int i = 0; i < num; i++)
    {
        copy_position[i] = position[i]; // Copying the position to another array so that the orginial array won’t be affected
    }
    sort(copy_position, copy_position + num); // Sorting the copied array
    int temp;
    int x1, x2;
    int position1, position2;
    int maxi = 0;
    for (int i = 0; i < num - 1; i++)
    {
        int temp = abs(copy_position[i + 1] - copy_position[i]); // Difference between two adjacent array elements is calculated
        if (temp > maxi)
        {
            maxi = temp;           // The highest difference is noted
            x1 = copy_position[i]; // The two elements are noted
            x2 = copy_position[i + 1];
        }
    }
    for (int i = 0; i < num; i++) // The elements position are found in the main position array
    {
        if (x1 == position[i])
        {
            position1 = i;
        }
        else if (x2 == position[i])
        {
            position2 = i;
        }
    }
    if (house_number[position1] > house_number[position2]) // The house number is displayed which is matched by the position obtained
    {
        cout <<“Result : “<<“[“<< house_number[position2] <<“,”<< house_number[position1] <<“] “;
    }
    else
    {
        cout <<“Result : “<<“[“<< house_number[position1] <<“,”<< house_number[position2] <<“] “;
    }
    return 0;
}
