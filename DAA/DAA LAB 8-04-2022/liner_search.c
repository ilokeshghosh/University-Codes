#include <stdio.h>
int main()
{
    int n;
    printf("Enter the lenth of the array :");
    scanf("%d", &n);
    int a[n];
    int x = 4;

    printf("Time to take input : \n");

    for (int i = 1; i <= (n - 1); i++)
    {
        printf("Enter the number of %d position: ", i);
        scanf("%d", &a[i]);
    }

    for (int i = 1; i < n - 1; i++)
    {
        if (a[i] == x)
        {
            printf("The number has found in %d position \n", i);
            goto end;
            
            
        }
        
        
    
  
    }
    printf("The number hasn't found :");
    end:
   

    return 0;
}
