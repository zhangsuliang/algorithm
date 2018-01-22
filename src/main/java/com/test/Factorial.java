package com.test;

public class Factorial {

    /**
     * 阶乘
     * @param n
     * @return
     */
    public static Integer factorial(int n){
        if(n<1){
            return 1;
        }else {
            return n*factorial(n-1);
        }
    }

    public static void main(String[] args) {
        System.out.println(factorial(5));
    }
}
