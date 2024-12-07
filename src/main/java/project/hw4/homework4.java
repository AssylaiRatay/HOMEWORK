package project.hw4;

public class homework4 {
        public static void main(String[] args) {
            User[] users = {
                    new User("Мария", "Соколова", "Игоревна", 1965, "maria.sokolova@example.com"),
                    new User("Андрей", "Петров", "Владимирович", 1970, "andrey.petrov@example.com"),
                    new User("Елена", "Кузьмина", "Сергеевна", 1982, "elena.kuzmina@example.com"),
                    new User("Иван", "Морозов", "Алексеевич", 1995, "ivan.morozov@example.com"),
                    new User("Наталья", "Леонова", "Павловна", 1988, "natalia.leonova@example.com"),
                    new User("Сергей", "Васильев", "Дмитриевич", 1975, "sergey.vasiliev@example.com"),
                    new User("Анна", "Иванова", "Михайловна", 1992, "anna.ivanova@example.com"),
                    new User("Петр", "Семенов", "Николаевич", 1968, "petr.semenov@example.com"),
                    new User("Оксана", "Тихонова", "Витальевна", 1980, "oksana.tikhonova@example.com"),
                    new User("Виктор", "Зайцев", "Юрьевич", 1973, "viktor.zaytsev@example.com"),
            };

            int currentYear = 2024;
            for (User user : users) {
                int age = currentYear - user.getBirthYear();
                if (age >= 40) {
                    user.info(age);
                }
            }
        }
    }