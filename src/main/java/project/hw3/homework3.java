package project.hw3;

public class homework3 {


    public static void main(String[] args) {
        int[][] matrix = {
                {1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12},
                {13, 14, 15, 16}
        };

        System.out.println("Sum of Positive Elements: " + sumOfPositiveElements(matrix));
        System.out.println("Max Element: " + findMax(matrix));
        System.out.println("Matrix with Zero Diagonals:");
        int[][] modifiedMatrix = zeroDiagonals(matrix);
        printMatrix(modifiedMatrix);
        System.out.println("Sum of Second Row: " + sumOfTwo(matrix));
        System.out.println("Stars:");
        stars(10);
    }

    public static int sumOfPositiveElements(int[][] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > 0) {
                    sum += array[i][j];
                }
            }
        }
        return sum;
    }

    public static int findMax(int[][] array) {
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }

    public static int[][] zeroDiagonals(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 0; // Главная диагональ
            array[i][array.length - i - 1] = 0; // Побочная диагональ
        }
        return array;
    }

    public static int sumOfTwo(int[][] array) {
        int sum = 0;
        if (array.length >= 2) {
            for (int i = 0; i < array[1].length; i++) { // Изменено на array[1], чтобы взять вторую строку
                sum += array[1][i];
            }
        } else {
            sum = -1; // Возможно, лучше использовать Exception
        }
        return sum;
    }

    public static void stars(int size) {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("*"); // Используем print для вывода на одной строке
            }
            System.out.println(); // Переход на новую строку
        }
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}


