package project.hw1;

import java.util.Scanner;

public class homework1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);



        // Запрос числа от 1 до 5 у пользователя
        System.out.println("Введите число от 1 до 5:");
        int choice = scanner.nextInt();

        if (choice == 1) {
            greetings();
        } else if (choice == 2) {
            checkSign();
        } else if (choice == 3) {
            selectColor();
        } else if (choice == 4) {
            compareNumbers();
        } else if (choice == 5) {
            addOrSubtractAndPrint();
        } else {
            System.out.println("Неправильный ввод.");
        }
    }


    public static void greetings() {
        System.out.println("Hello\nWorld\nfrom\nJava");
    }


    public static void checkSign() {
        int a = (int) (Math.random() * 200 - 100); // случайное число от -100 до 100
        int b = (int) (Math.random() * 200 - 100);
        int c = (int) (Math.random() * 200 - 100);

        System.out.println("Числа: a=" + a + ", b=" + b + ", c=" + c);

        int result = a + b + c;
        if (result >= 0) {
            System.out.println("Сумма положительная");
        } else {
            System.out.println("Сумма отрицательная");
        }
    }


    public static void selectColor() {
        int data = (int) (Math.random() * 30); // случайное значение от 0 до 30
        System.out.println("Значение data: " + data);
        if (data <= 10) {
            System.out.println("Красный");
        } else if (data > 10 && data <= 20) {
            System.out.println("Желтый");
        } else {
            System.out.println("Зеленый");
        }
    }


    public static void compareNumbers() {
        int a = (int) (Math.random() * 100); // случайные значения от 0 до 30
        int b = (int) (Math.random() * 100);
        System.out.println("a: " + a + ", b: " + b);
        if (a >= b) {
            System.out.println("a >= b");
        } else {
            System.out.println("a < b");
        }
    }

    public static void addOrSubtractAndPrint() {
        int initValue = (int) (Math.random() * 100); // случайное значение от 0 до 100
        int delta = (int) (Math.random() * 50);      // случайное значение от 0 до 50
        boolean increment = Math.random() < 0.5;     // случайное булево значение

        System.out.println("initValue: " + initValue + ", delta: " + delta + ", increment: " + increment);

        int result;
        if (increment) {
            result = initValue + delta;
        } else {
            result = initValue - delta;
        }
        System.out.println("Результат: " + result);
    }
}






