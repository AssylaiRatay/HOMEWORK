package project.hw8;

public class Main {
    public static void main(String[] args) {
        String[][] validArray = {
                {"1", "2", "3", "4"},
                {"5", "6", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        String[][] invalidSizeArray = {
                {"1", "2", "3"},
                {"4", "5", "6"},
                {"7", "8", "9"}
        };

        String[][] invalidDataArray = {
                {"1", "2", "3", "4"},
                {"5", "X", "7", "8"},
                {"9", "10", "11", "12"},
                {"13", "14", "15", "16"}
        };

        processAndPrint(validArray);
        processAndPrint(invalidSizeArray);
        processAndPrint(invalidDataArray);

        int sum = processArray(invalidDataArray);
    }

    private static void processAndPrint(String[][] array) {
        try {
            int sum = processArray(array); // Вызов метода для обработки массива
            System.out.println("Сумма элементов: " + sum);
        } catch (AppArraySizeException e) {
            System.out.println("Ошибка размера массива: " + e.getMessage());
        } catch (AppArrayDataException e) {
            System.out.println("Ошибка данных в массиве: " + e.getMessage());
        }
    }

    public static void checkArraySize(String[][] array) throws AppArraySizeException {
        // Проверяем, что сам массив содержит ровно 4 строки
        if (array.length != 4) {
            throw new AppArraySizeException("Массив должен содержать ровно 4 строки.");
        }

        // Проверяем каждую строку массива на наличие ровно 4 элементов
        for (int i = 0; i < array.length; i++) {
            if (array[i].length != 4) {
                throw new AppArraySizeException("Строка " + (i + 1) + " должна содержать ровно 4 элемента.");
            }
        }
    }

    public static int sumArrayElements(String[][] array) throws AppArrayDataException {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                try {
                    sum += Integer.parseInt(array[i][j]);
                } catch (NumberFormatException e) {
                    throw new AppArrayDataException("Ошибка в ячейке [" + i + "][" + j + "]: " + array[i][j]);
                }
            }
        }
        return sum;
    }

    public static int processArray(String[][] array) throws AppArraySizeException, AppArrayDataException {
        checkArraySize(array);
        return sumArrayElements(array);
    }


    static class AppArraySizeException extends RuntimeException {
        public AppArraySizeException(String message) {
            super(message);
        }
    }

    static class AppArrayDataException extends RuntimeException {
        public AppArrayDataException(String message) {
            super(message);
        }
    }
}
