/* 
 * File:   main.c
 * Author: morion
 *
 * Created on 25. November 2013, 09:27
 */

#include <stdio.h>
#include <stdlib.h>

typedef struct{
    int x, y;
} Ball;

int main(int argc, char** argv) {
    
    Ball a[] = {
        {5, 7},
        {1,3},
        {1,1}
    };
    int* p = (int*) a;
    while(*p)printf("%d\n",*p++);
    
    return 0;
}