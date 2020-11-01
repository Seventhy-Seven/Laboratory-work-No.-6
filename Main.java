package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        int[] arr = generateArray(5);

        printArray(arr);
        int[] newArr = copyArrayElements(arr, 3);
        printArray(newArr);


        int[] newArr_2 = copyArrayElements(arr, 30);
        printArray(newArr_2);
    }

    private static int[] generateArray(int size) {

        Random rand = new Random();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++)
        {
            arr[i] = rand.nextInt(10);
        }

        return arr;
    }

    private static int[] copyArrayElements(int[] nums, int num) {

        int newArrLength = num <= nums.length ? num : nums.length;

        int[] newArr = new int[newArrLength];

        System.arraycopy(nums, 0, newArr, 0, newArrLength);

        return newArr;
    }

    private static void printArray(int[] arr) {

        for (int i : arr)
        {
            System.out.print(i + " ");
        }

        System.out.print("\n");
    }
}
