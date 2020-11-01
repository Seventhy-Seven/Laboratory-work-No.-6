package com.company;

import java.util.Arrays;

public class Example01 {
    private char a;
    private String b;

    public void first(char a) {
            this.a = a;
    }

    public void first(String b){
        this.b = b;
    }

    public void first(char[] ar) {
        if (ar.length == 1){
            a = ar[0];
        }
        else {
            b = Arrays.toString(ar);
        }
    }

    public void print() {
        System.out.println("a = " + a + ", b = " + b);
    }
}
