#include <stdio.h>
int main()
{
    int n;
    printf("Enter the lenth of the array :");
    scanf("%d", &n);
    int a[n];

    printf("Time to take input : \n");

    for (int i = 0; i <= (n - 1); i++)
    {
        printf("Enter the %d number ", i);
        scanf("%d", &a[i]);
    }

    printf("Time to give output : \n");

    for (int i = 0; i <= (n - 1); i++)
    {
        printf(" The %d number of array is :%d \n", i, a[i]);
    }

    return 0;
}