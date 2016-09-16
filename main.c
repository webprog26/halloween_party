#include <stdio.h>
#include <stdlib.h>


int getHorizontalCuts(int attempts)
{
    if(attempts % 2 == 0)
    {
        return attempts / 2;
    }

    return attempts / 2 + (attempts % (attempts / 2));
}

unsigned long long calculateResult(int attempts)
{
    int horizontalCuts = getHorizontalCuts(attempts);

    int verticalCuts = attempts - horizontalCuts;

    return (unsigned long long) horizontalCuts * (unsigned long long) verticalCuts;
}

int main()
{

    int t;
    int k;

    scanf("%d", &t);

    for(int i = 0; i < t; i++)
    {
        scanf("%d", &k);
        printf("%llu\n",  calculateResult(k));
    }
    return 0;
}
