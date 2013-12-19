/* 
 * File:   main.c
 * Author: morion
 *
 * Created on 9. Dezember 2013, 10:09
 */

#include <stdio.h>
#include <stdlib.h>

enum {
    WIDTH = 100,
    HEIGHT = 200
};
typedef struct {
    int x,y,r,e;
} Circle;

Circle circle1 = {50,50,40,2};
Circle circle2 = {50,50,10,2};
Circle circle3 = {50,50,3,3};

int main(int argc, char** argv) {
    FILE* file = fopen("bild.ppm","w");
    if(file == NULL){
        printf("Error\n");
        return 1;
    }
    
    fprintf(file,"P6 %d %d 255 ",WIDTH,HEIGHT);
    for(int y=0;y<HEIGHT;y++){
        for(int x=0;x<WIDTH;x++){
            int dx1 = x-circle1.x;
            int dy1 = y-circle1.y;
            int dx2 = x-circle2.x;
            int dy2 = y-circle2.y;
            int dx3 = x-circle3.x;
            int dy3 = y-circle3.y;
            if(dx1*dx1 + dy1*dy1 <= circle1.r*circle1.r && dx1*dx1 + dy1*dy1 >= (circle1.r-circle1.e)*(circle1.r-circle1.e)
                || dx2*dx2 + dy2*dy2 <= circle2.r*circle2.r && dx2*dx2 + dy2*dy2 >= (circle2.r-circle2.e)*(circle2.r-circle2.e)
                || dx3*dx3 + dy3*dy3 <= circle3.r*circle3.r && dx3*dx3 + dy3*dy3 >= (circle3.r-circle3.e)*(circle3.r-circle3.e)
                || y > 48 && y < 52 && (x > 11 && x < 41 || x > 59 && x < 89)
                    ){
                fprintf(file, "%c%c%c",0,0,0);
            } 
            else if(dx1*dx1 + dy1*dy1 <= (circle1.r-circle1.e)*(circle1.r-circle1.e) && y <= 48 && dx2*dx2 + dy2*dy2 >= circle2.r*circle2.r){
                fprintf(file, "%c%c%c",255,0,0);
            }
            else{
                fprintf(file, "%c%c%c",255,255,255);
            }
        }
    }
    
    return 0;
}

