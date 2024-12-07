package project.hw5.animals;

public class Cat extends Animal {
        public Cat(String name, float runSpeed, int stamina) {
            super(name, runSpeed, 0, stamina); // У кота swimSpeed = 0, так как он не умеет плавать
        }
        @Override
        public float swim(int distance) {
            System.out.println(name + " не умеет плавать.");
            return -1; // Указываем, что плавание невозможно
        }
    }

