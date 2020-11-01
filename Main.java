package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args)
      {
        test(3);
        test(9);
      }

    private static void test(int a)
      {
        char[] arr = genAr(a);
        printAr(arr);

        char[] newArr = exchange(arr);
        printAr(newArr);
      }

    private static char[] genAr(int b)
      {
        Random rand = new Random();
        char[] arr = new char[b];

        for (int i = 0; i < b; i++)
        {
            arr[i] = (char) ('a' + rand.nextInt(26));
        }
        return arr;
      }

    private static char[] exchange(char[] chars)
      {
        char[] newArr = new char[chars.length];
        int arraySize = chars.length / 2;
        for(int i = 0;  (chars.length % 2 == 0 && i < arraySize) || (chars.length % 2 != 0 && i <= arraySize); i++)
        {
            int leftIndex = i;
            int rightIndex = chars.length - 1 - i;

            newArr[leftIndex] = chars[rightIndex];
            newArr[rightIndex] = chars[leftIndex];
        }
        return newArr;
      }

    private static void printAr(char[] arr)
      {
        for (char i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n");
      }
}
