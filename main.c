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

int main()
{

    return 0;
}
