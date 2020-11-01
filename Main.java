package com.company;
import java.util.Random;

public class Main {

    public static void main(String[] args)
    {
        int[] arr = genAr(5);
        printAr(arr);

        int averageValue = calculate(arr);
        System.out.println("Average value = " + averageValue);
    }

    private static int[] genAr(int size)
    {

        Random rand = new Random();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++)
        {
            arr[i] = rand.nextInt(10);
        }
        return arr;
    }

    private static int calculate(int[] nums)
    {
        long a = 0;
        for(int i : nums)
        {
            a += i;
        }
        return (int) a / nums.length;
    }

    private static void printAr(int[] arr)
    {
        System.out.print("Array: ");
        for (int i : arr)
        {
            System.out.print(i + " ");
        }
        System.out.print("\n");
    }
}
