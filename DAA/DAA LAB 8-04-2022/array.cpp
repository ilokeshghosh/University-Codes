#include <iostream>
using namespace std;
int main()
{
    int n;
    cout << "Enter the length of the array :" << endl;
    cin >> n;
    int ar[n];
    cout << "Time to take input " << endl;

    for (int i = 0; i <= n - 1; i++)
    {
        cout << "The " << i << " number is: ";
        cin >> ar[i];
    }

    cout << "Time to give output  " << endl;

    for (int i = 0; i <= n - 1; i++)
    {
        cout << "The " << i << " number is: " << ar[i] << endl;
    }
}
