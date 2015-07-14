/**
 * File:   main.c
 * Author: Jonathan
 *
 * Created on July 14, 2015, 5:40 PM
 */

#include <stdio.h>
#include <stdlib.h>

/**
 * 
 */

int modulus(int a, int b);

int main(int argc, char** argv) {
    printf("Input two numbers: ");
    int a, b;
    scanf("%d %d", &a, &b);
    
    return (EXIT_SUCCESS);
}

int modulus(int a, int b){
    if(a < b){
        return a;
    }
    else{
        return modulus(a-b, b);
    }
}
