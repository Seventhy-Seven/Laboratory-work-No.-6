package com.company;

public class Main {
        public static void main(String[] args) {

            sumSquares(5);
            sumSquaresRecursion(5, 1, 0);
        }


        private static void sumSquaresRecursion(int num, int i, int d)
        {
            System.out.print(i + "^2");
            d += i * i;

            int nextIter = i + 1;
            if (nextIter <= num) {
                System.out.print(" + ");
            }

            if (i == num) System.out.print(" = " + d);
            else sumSquaresRecursion(num, nextIter, d);
        }

        private static void sumSquares(int a)
        {

            int b = 0;

            for (int i = 1; i <= a; i++)
            {
                System.out.print(i + "^2");
                b += i * i;

                if (i + 1 <=a)
                {
                    System.out.print(" + ");
                }
            }

            System.out.println(" = " + b);
        }
}

