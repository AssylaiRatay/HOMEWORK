package project.hw2;

import java.util.Arrays;

public class homework2 {

    public static void main(String[] args) {
        printString(3, "Java");

        int[] array1 = {1, 7, 5, 2, 6, 9, 4};
        sumArray(array1);

        fillArray(new int[7], 9);

        int[] array3 = {2, 3, 4, 3, 5, 1};
        saveArray(array3, 5);

        int[] array4 = {2, 8, 4, 3, 5, 1};
        addArray(array4);

    }

    public static void printString(int number, String text) {
        for (int i = 0; i < number; i++) {
            System.out.println(text);
        }
    }

    public static void sumArray(int[] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > 5) {
                sum += numbers[i];
            }
        }
        System.out.println(sum);
    }

    public static void fillArray(int[] array2, int number) {
        for (int i = 0; i < array2.length; i++) {
            array2[i] = number;
        }
        System.out.println("Заполнненый массив: " + Arrays.toString(array2));
    }

    public static void saveArray(int[] array3, int number) {
        for (int i = 0; i < array3.length; i++) {
            array3[i] += number;
        }
        System.out.println("Заполнненый массив: " + Arrays.toString(array3));
    }

    public static void addArray(int[] array4) {
        int mid = array4.length / 2;
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < mid; i++) {
            sum1 += array4[i];
        }
        for (int i = mid; i < array4.length; i++) {
            sum2 += array4[i];
        }
        if (sum1 > sum2) {
            System.out.println("Сумма первой половины массива больше");
        } else if (sum1 < sum2) {
            System.out.println("Сумма второй половины массива больше");
        } else {
            System.out.println("Суммы обеих половин массива равны");
        }
    }

}
