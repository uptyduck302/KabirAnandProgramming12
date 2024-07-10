package com.anand.recursion;

public class Main {
    public static int multIterative(int a, int b){
        int result = 0;
        for(int i = 0 ; i < b;i++){
            result += a;
        }
        return result;
    }

    public static int multRecursive(int a, int b){
        //base case
        if(b == 1){
            return a;
        }
        return a + multRecursive(a, b-1);
    }
    //Factorial 5! = 5 x 4 x 3 x 2 x 1
    public static int factorial(int num){
        if(num == 1){
            return num;
        }
        return num * factorial(num - 1);
    }

    public static void main(String[] args) {
        System.out.println(factorial(3));

    }
}