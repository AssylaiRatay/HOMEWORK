package project.hw4;

public class User {
    private String firstName;
    private String lastName;
    private String middleName;
    private int birthYear;
    private String email;

    // Конструктор
    public User(String firstName, String lastName, String middleName, int birthYear, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.birthYear = birthYear;
        this.email = email;
    }

    // Геттер для birthYear
    public int getBirthYear() {
        return birthYear;
    }

    // Метод для вывода информации о пользователе
    public void info(int age) {
        System.out.println(firstName + " " + lastName + " " + middleName + ", возраст: " + age + ", email: " + email);
    }
}
