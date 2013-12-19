/*
#include <stdio.h>
#define Q(b) putc(b,stdout);
void main(){
    char l[256];
    while(gets(l)){
        char* p=l;p--;
        while(*(++p)){Q(*p)Q(*p==0?13:32)}
    }
} 
*/

#include <stdio.h>

int main(){
    char line[256];
    while(fgets(line,256,stdin)){
        char* p = (char*) line ;
        while(*p){
            printf("%c",*p++);
            if(*p != 10) printf(" ");
            else{
                printf("\n");
                break;}
            
        }
    }
    return 0;
} 
