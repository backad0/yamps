package Idz1SecondCource;

import java.util.Scanner;

public class Idz1num8to14 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Input array size");
        int x = in.nextInt();
        System.out.println("Input segment");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Input elements");
        int[] array = new int[x];
        for (int i = 0; i < x; i++) {
            array[i] = in.nextInt();
        }
        task8and9(array);
        System.out.printf("sum: %d\n", task10(array));
        System.out.printf("sum of even numbers: %d\n", task11(array));
        System.out.printf("sum of numbers in segment: %d\n", task12(array, a, b));
        boolean truth = task13(array);
        if (truth) {
            System.out.println("All numbers are positive");
        } else {
            System.out.println("Not all numbers are positive");
        }
        System.out.println("Reversed array:");
        task14(array);
        task8and9(array);

        in.close();
    }

    public static void task8and9(int[] arr) {
        for (int Values : arr) {
            System.out.printf("|| %4d  ||\n", Values);
        }

    }

    public static int task10(int[] arr) {
        int sum = 0;
        for (int Values : arr) {
            sum += Values;
        }
        return sum;
    }

    public static int task11(int[] arr) {
        int sum = 0;
        for (int Values : arr) {
            if ((Values % 2) == 0) sum++;
        }
        return sum;
    }

    public static int task12(int[] arr, int elem1, int elem2) {
        int sum = 0;
        for (int Values : arr) {
            if ((Values >= elem1) && (Values <= elem2)) sum++;
        }
        return sum;
    }

    public static boolean task13(int[] arr) {
        for (int Values : arr) {
            if (Values < 0) {
                return false;
            }
        }
        return true;
    }

    public static void task14(int[] arr) {
        int elem;
        for (int i = 0; i < (arr.length / 2); i++) {
            elem = arr[i];
            arr[i] = arr[arr.length - 1 - i];
            arr[arr.length - i - 1] = elem;
        }
    }
}
