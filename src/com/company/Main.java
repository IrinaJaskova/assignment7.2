package com.company;

public class Main {

    public static void main(String[] args) {
        int[] arr = {10, 4, -4, 7, 0, 9, 1, 3, 7, -5};

        Negative(arr);
        Odd(arr);
        Equal(arr);
        Second(arr);
        System.out.println("Average value of the array " + Average(arr));
        Smaller(arr, Average(arr));
    }

    public static void Negative(int[] array) {
        System.out.println("Negative numbers are ");
        for (int i = 0; i < array.length; i++)
            if (array[i] < 0) {
                System.out.println(array[i]);
            }
    }

    public static void Odd(int[] array) {
        int counter = 0;
        System.out.println("Odd numbers are ");
        for (int i = 0; i < array.length; i++)
            if (array[i] % 2 != 0) {
                counter++;
                System.out.println(array[i]);
            }
        System.out.println("There are " + counter + " odd numbers");
    }

    public static void Equal(int[] array) {
        int i = 0;
        while (i < array.length) {
            int a = i + 1;
            while (a < array.length) {
                if (array[a] == array[i]) {
                    System.out.println("Number " + array[i] + " is equal to number " + array[a]);
                }
                a++;
            }
            i++;
        }
    }

    public static void Second(int[] array) {
        System.out.println("Every second element of array ");
        for (int i = 1; i < array.length; i = i + 2)
            System.out.println(array[i]);
    }

    public static double Average(int[] array) {
        int sum = 0, counter = 0;
        for (int i : array) {
            sum = sum + i;
            counter = counter + 1;
        }
        return (double) sum / (double) counter;
    }

    public static void Smaller(int[] array, double average) {
        System.out.println("Smaller than average are ");
        for (int i = 0; i < array.length; i++)
            if (array[i] < average) {
                System.out.println(array[i]);
            }
    }
}