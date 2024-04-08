package com.example.learning.service;

public class Factorial {
    public int getFactorial(int input){
        if (input == 0){
            return 1;
        }
        return (input * getFactorial(input-1));
    }
}
