

#include <stdio.h>

void print(int n)
{
        //if(n != 0)
    {
        print(n-1);
        printf("\n");
        print(n-1);
        printf("%d",n);
   }
}
int main()
{
        print(3);
}
