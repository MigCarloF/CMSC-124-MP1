#include<stdio.h>

void display();
float conv(float);

void display(){
    float temp = 0;

    printf("Input Temperature in Farenheit: ");
    scanf("%f", &temp);

    printf("Your temperature converted to Celsius: %f", conv(temp));
}

float conv(float temp){
    return (temp - 32.0) * 5 / 9;
}