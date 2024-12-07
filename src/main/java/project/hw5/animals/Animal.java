package project.hw5.animals;

public class Animal {
    protected String name;
    protected float runSpeed;
    protected float swimSpeed;
    protected int stamina;

    public Animal(String name,float runSpeed,float swimSpeed, int stamina) {
        this.name = name;
        this.runSpeed = runSpeed;
        this.swimSpeed = swimSpeed;
        this.stamina = stamina;
    }

    public float run(int distance) {
        if (stamina < distance) { // Проверяем, достаточно ли выносливости
            System.out.println(name + " устал и не может пробежать " + distance + " метров.");
            stamina = 0; // Устанавливаем состояние усталости
            return -1; // Возвращаем время -1
        }
        float time = distance / runSpeed; // Расчет времени бега
        stamina -= distance; // Уменьшаем выносливость
        System.out.println(name + " пробежал " + distance + " метров за " + time + " секунд. Оставшаяся выносливость: " + stamina);
        return time; // Возвращаем время
    }

    // Метод для плавания
    public float swim(int distance) {
        if (stamina < distance) { // Проверяем, достаточно ли выносливости
            System.out.println(name + " устал и не может проплыть " + distance + " метров.");
            stamina = 0; // Устанавливаем состояние усталости
            return -1; // Возвращаем время -1
        }
        float time = distance / swimSpeed; // Расчет времени плавания
        stamina -= distance; // Уменьшаем выносливость
        System.out.println(name + " проплыл " + distance + " метров за " + time + " секунд. Оставшаяся выносливость: " + stamina);
        return time; // Возвращаем время
    }

    // Метод для вывода текущего состояния животного
    public void info() {
        System.out.println("Имя: " + name);
        System.out.println("Скорость бега: " + runSpeed + " м/с");
        System.out.println("Скорость плавания: " + swimSpeed + " м/с");
        System.out.println("Оставшаяся выносливость: " + stamina);
    }






}
