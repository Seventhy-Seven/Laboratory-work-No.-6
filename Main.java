package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        char[] arr = genAr(5);
        printAr(arr);

        int[] newArr = getChars(arr);
        printChar(newArr);
    }


    private static char[] genAr(int size)
    {
        Random rand = new Random();
        char[] arr = new char[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = (char) ('a' + rand.nextInt(26));
        }
        return arr;
    }


    private static int[] getChars(char[] chars)
    {
        int[] newArr = new int[chars.length];
        for(int i = 0; i < chars.length; i++) { newArr[i] = chars[i]; }
        return newArr;
    }


    private static void printAr(char[] arr)
    {
        for (char i : arr) { System.out.print(i + " "); }
        System.out.print("\n");
    }


    private static void printChar(int[] arr)
    {
        System.out.println("Код символа: ");
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}
