package com.company;

public class Main {
    private static int a = 0;

    public static void main(String[] args) {
        printNumber();
        printNumber();
        printNumber();
    }

    private static void printNumber(){
        System.out.println(a++);
    }
}
