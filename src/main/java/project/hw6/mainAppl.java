package project.hw6;

public class mainAppl {
    public static void main(String[] args) {
        // Создаем тарелку
        Plate plate = new Plate(50);

        // Создаем массив котов
        Cat[] cats = {
                new Cat("Барсик", 10),
                new Cat("Мурзик", 15),
                new Cat("Рыжик", 25),
                new Cat("Васька", 5)
        };

        // Коты едят из тарелки
        for (Cat cat : cats) {
            cat.eat(plate);
            System.out.println(cat);
        }

        // Вывод информации о тарелке после кормления
        System.out.println(plate);
    }
}
